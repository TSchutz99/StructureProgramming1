package LabSheet9;
/* Java Progrma Exercise4
 * By: Faun Schutz
 * Start: 02/12/2019
 * Finish: 02/12/2019
 *
 * Input piece of text and then tests to see if it is a binary number.
 */
 
import java.util.Scanner;
public class Exercise4{
	public static void main(String args[])
	{
		String text;
		char character;
		int binary = 0; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a piece of text: ");
		text = input.nextLine();
		
		for(int i=0;i<text.length();i++)
		{
			character = text.charAt(i);
			
			if(character != '0' && character != '1'){
				System.out.println("\nYou have not entered a binary number");
				break;
			}	
		    else
		    	binary++;
		}
		if(binary == text.length())
		    System.out.println("\nYou entered a binary number");
	}
}