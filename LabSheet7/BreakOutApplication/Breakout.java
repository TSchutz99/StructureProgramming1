package LabSheet7.BreakOutApplication;
//
// Breakout game
//
// (C)2000
// Brian Postma
// b.postma@hetnet.nl
//
// Modified by JB in October 2019 to convert it from an applet to a GUI application
// as applets are no longer supported by Java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Breakout extends JPanel implements Runnable, KeyListener
{
  Dimension	d;
  
  Font 		largefont = new Font("Helvetica", Font.BOLD, 24);
  Font		smallfont = new Font("Helvetica", Font.BOLD, 14);

  FontMetrics	fmsmall, fmlarge;  
  Graphics	goff,g;
  Image		ii;
  Thread	thethread;

  boolean	ingame=false;

  int		player1score;
  int		ballx,bally;
  int		batpos;
  int		batdpos=0;
  int		balldx=0, balldy=0;
  int		dxval;
  int		ballsleft;
  int		count;
  boolean	showtitle=true;
  boolean[]	showbrick;
  int		bricksperline;

  final int	borderwidth=5;
  final int	batwidth=20;
  final int	ballsize=5;
  final int	batheight=5;
  final int	scoreheight=20;
  final int	screendelay=300;
  final int	brickwidth=15;
  final int     brickheight=8;
  final int	brickspace=2;
  final int	backcol=0x102040;
  final int	numlines=4;
  final int     startline=32;
  static Breakout gamePanel;
 
  
  public static void main(String args[])
  {
  	
  	JFrame f = new JFrame("Breakout");
  	
  	gamePanel = new Breakout();
  	
  	gamePanel.setSize(300,300);
  	  	
  	f.add(gamePanel,BorderLayout.CENTER);
  	f.addKeyListener(gamePanel);
  	 	
  	gamePanel.init();
  	
    f.setSize(315,320);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setResizable(false);
    f.setVisible(true);   
  }

  public void init()
  {
    d = size();
    setBackground(new Color(backcol));
    
    bricksperline=(d.width-2*borderwidth)/(brickwidth+brickspace);
    d.width=bricksperline*(brickwidth+brickspace)+(2*borderwidth);

    showbrick=new boolean[bricksperline*numlines];
    
    start();
  
    GameInit();
  }
  
  
        

  public void GameInit()
  {
    batpos=(d.width-batwidth)/2;
    ballx=(d.width-ballsize)/2;
    bally=(d.height-ballsize-scoreheight-2*borderwidth);
    player1score=0;
    ballsleft=3;
    dxval=2;
    if (Math.random()<0.5)
      balldx=dxval;
    else
      balldx=-dxval;
    balldy=-dxval;
    count=screendelay;
    batdpos=0;
    InitBricks();
    
  }

  public void InitBricks()
  {
    int i;
    for (i=0; i<numlines*bricksperline; i++)
      showbrick[i]=true;
  }

  
  public void keyPressed(KeyEvent e) {
  	//System.out.println("Key pressed");
      if (ingame)
       {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            batdpos=3;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            batdpos=-3;
        }
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
            ingame=false;
       }
      else
	    {
	      if (e.getKeyChar() == 's')
	      {
	        ingame=true;
	        GameInit();
	      }
	    }

    }
  
   public void keyReleased(KeyEvent e) {
  	   if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT)
           batdpos=0;
   }
  
   public void keyTyped(KeyEvent e) { }
  


  public void paintComponent(Graphics g)
  {
    String s;
    Graphics gg;
    
    super.paintComponent(g);
   

    if (goff==null && d.width>0 && d.height>0)
    {
      ii = createImage(d.width, d.height);
      goff = ii.getGraphics();
    }
    if (goff==null || ii==null)
      return;

    goff.setColor(new Color(backcol));
    goff.fillRect(0, 0, d.width, d.height);
    if (ingame)
      PlayGame();
    else
      ShowIntroScreen();
    g.drawImage(ii, 0, 0, this);
  }


  public void PlayGame()
  {
    MoveBall();
    CheckBat();
    CheckBricks();
    DrawPlayField();
    DrawBricks();
    ShowScore();
  }

  public void ShowIntroScreen()
  {
    String s;
    
    goff.setFont(smallfont);
    fmsmall = goff.getFontMetrics();
    goff.setFont(largefont);
    fmlarge = goff.getFontMetrics();

    MoveBall();
    CheckBat();
    CheckBricks();
    BatDummyMove();
    DrawPlayField();
    DrawBricks();
    ShowScore();
  
    goff.setFont(largefont);
    goff.setColor(new Color(96,128,255));

    if (showtitle)
    {
      s="Java Breakout";
      goff.drawString(s,(d.width-fmlarge.stringWidth(s)) / 2, (d.height-scoreheight-borderwidth)/2 - 20);
      s="(c)2000 by Brian Postma";
      goff.setFont(smallfont);
      goff.setColor(new Color(255,160,64));
      goff.drawString(s,(d.width-fmsmall.stringWidth(s))/2,(d.height-scoreheight-borderwidth)/2 + 10);
      s="b.postma@hetnet.nl";
      goff.drawString(s,(d.width-fmsmall.stringWidth(s))/2,(d.height-scoreheight-borderwidth)/2 + 30);
    }
    else
    {
      goff.setFont(smallfont);
      goff.setColor(new Color(96,128,255));
      s="'S' to start game";
      goff.drawString(s,(d.width-fmsmall.stringWidth(s))/2,(d.height-scoreheight-borderwidth)/2 - 10);
      goff.setColor(new Color(255,160,64));
      s="Use cursor left and right to move";
      goff.drawString(s,(d.width-fmsmall.stringWidth(s))/2,(d.height-scoreheight-borderwidth)/2 + 20);
    }
    count--;
    if (count<=0)
    { count=screendelay; showtitle=!showtitle; }
  }


  public void DrawBricks()
  {
    int i,j;
    boolean nobricks=true;
    int colordelta=255/(numlines-1);
   

    for (j=0; j<numlines; j++)
    {
      for (i=0; i<bricksperline; i++)
      {
        if (showbrick[j*bricksperline+i])
        {
          nobricks=false;
          goff.setColor(new Color(255,j*colordelta,255-j*colordelta));
          goff.fillRect(borderwidth+i*(brickwidth+brickspace), startline+j*(brickheight+brickspace),
               brickwidth, brickheight);
        }
      }
    }
    if (nobricks)
    {
      InitBricks();
      if (ingame)
        player1score+=100;
    }
  }
   
  public void DrawPlayField()
  {
    goff.setColor(Color.white);
    goff.fillRect(0,0,d.width,borderwidth);
    goff.fillRect(0,0,borderwidth,d.height);
    goff.fillRect(d.width-borderwidth,0,borderwidth,d.height);
    goff.fillRect(batpos,d.height-2*borderwidth-scoreheight, batwidth,batheight); // bat
    goff.fillRect(ballx,bally,ballsize,ballsize); // ball
  }


  public void ShowScore()
  {
  	//System.out.println("caling showScore()");
    String s;
    goff.setFont(smallfont);
    goff.setColor(Color.white);

    s="Score: "+player1score;
    //goff.drawString(s,40,d.height-5);
    goff.drawString(s,30,20);
    s="Balls left: "+ballsleft;
    goff.drawString(s,200,20);
  }


  public void MoveBall()
  {
    ballx+=balldx;
    bally+=balldy;
    if (bally<=borderwidth)
    {
      balldy=-balldy;
      bally=borderwidth;
    }
    if (bally>=(d.height-ballsize-scoreheight))
    {
      if (ingame)
      {
        ballsleft--;
        if (ballsleft<=0)
          ingame=false;
      }
      ballx=batpos+(batwidth-ballsize)/2;
      bally=startline+numlines*(brickheight+brickspace);
      balldy=dxval;
      balldx=0;
    }
    if (ballx>=(d.width-borderwidth-ballsize))
    {
      balldx=-balldx;
      ballx=d.width-borderwidth-ballsize;
    }
    if (ballx<=borderwidth)
    {
      balldx=-balldx;
      ballx=borderwidth;
    }
  }

  public void BatDummyMove()
  {
    if (ballx<(batpos+2))
      batpos-=3;
    else if (ballx>(batpos+batwidth-3))
      batpos+=3;
  }

  public void CheckBat()
  {
    batpos+=batdpos;

    if (batpos<borderwidth)
      batpos=borderwidth;
    else if (batpos>(d.width-borderwidth-batwidth))
      batpos=(d.width-borderwidth-batwidth);
 
    if (bally>=(d.height-scoreheight-2*borderwidth-ballsize) && 
        bally<(d.height-scoreheight-2*borderwidth) &&
        (ballx+ballsize)>=batpos && ballx<=(batpos+batwidth))
    {
      bally=d.height-scoreheight-ballsize-borderwidth*2;
      balldy=-dxval;
      balldx=CheckBatBounce(balldx,ballx-batpos);
    }
  }

  public int CheckBatBounce(int dy, int delta)
  {
    int sign;
    int stepsize, i=-ballsize, j=0;
    stepsize=(ballsize+batwidth)/8;

    if (dy>0)
      sign=1;
    else
      sign=-1;

    while(i<batwidth && delta>i)
    {
      i+=stepsize;
      j++;
    }
    switch(j)
    {
      case 0:
      case 1:
        return -4;
      case 2:
	return -3;
      case 7:
        return 3;
      case 3:
      case 6:
        return sign*2;
      case 4:
      case 5:
        return sign*1;
      default:
        return 4;
    }
  }

  public void CheckBricks()
  {
    int i,j,x,y;
    int xspeed=balldx;
    if (xspeed<0) xspeed=-xspeed;
    int ydir=balldy;

    if (bally<(startline-ballsize) || bally>(startline+numlines*(brickspace+brickheight)))
      return;
    for (j=0; j<numlines; j++)
    {
      for (i=0; i<bricksperline; i++)
      {
        if (showbrick[j*bricksperline+i])
        {
          y=startline+j*(brickspace+brickheight);
          x=borderwidth+i*(brickspace+brickwidth);
          if (bally>=(y-ballsize) && bally<(y+brickheight) &&
              ballx>=(x-ballsize) && ballx<(x+brickwidth))
          {
            showbrick[j*bricksperline+i]=false;
            if (ingame)
              player1score+=(numlines-j);
            // Where did we hit the brick
            if (ballx>=(x-ballsize) && ballx<=(x-ballsize+3))
            { // leftside
              balldx=-xspeed;
            }
            else if (ballx<=(x+brickwidth-1) && ballx>=(x+brickwidth-4))
            { // rightside
              balldx=xspeed;
            }              
            balldy=-ydir;
          }
        }
      }
    }
  }

  public void run()
  {
    long  starttime;
    //Graphics g;

    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    //g=getGraphics();
 

    while(true)
    {
      starttime=System.currentTimeMillis();
      try
      {
        //paint(g);
        repaint();
        
        
        starttime += 20;
        Thread.sleep(Math.max(0, starttime-System.currentTimeMillis()));
      }
      catch (InterruptedException e)
      {
        break;
      }
    }
  }

  public void start()
  {
    if (thethread == null) {
      thethread = new Thread(this);
      thethread.start();
    }
  }

  public void stop()
  {
    if (thethread != null) {
      thethread.stop();
      thethread = null;
    }
  }
}
