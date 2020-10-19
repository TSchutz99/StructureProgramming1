package LabSheet9;
/* Java DataSentinelFor
 * By: Faun Schutz
 * Start: 27/11/2019
 * Finish: 27/11/2019
 *
 *  
 */
 
import java.util.Scanner;
public class DataSentinelFor{
	public static void main(String args[])
	{
		String name, LongestName="", shortestName="";
		int atLeast17 = 0, i;
		
		Scanner input = new Scanner(System.in);
		
		for(i=0; i<=100000;i++)
		{
			System.out.print("Please enter a name (hit return to exit): ");
			name = input.nextLine();
			
			if(name.equals(""))
				break;
			
			if(i==0)
			{
				LongestName = name;
				shortestName = name;
			}
			else
				if(name.length()>LongestName.length())
					LongestName = name;
				else if(name.length()<shortestName.length())
					shortestName = name;
				if(name.length()>=17)
					atLeast17++;
			
			
		}
		if(LongestName.length() == 0)
			System.out.println("\nYou entered no names at all");
		else
			System.out.println("\nThe longest name entered is " + LongestName +
							   "\nThe shortest name entered is " + shortestName + 
							   "\nThe percentage of names >=  17 in length is " +
							   	String.format("%.2f", ((float)atLeast17/i)*100)); 
	}
}