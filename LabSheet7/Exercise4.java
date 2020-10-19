package LabSheet7;
/* Java Program Exercise4
 * By: Faun Schutz
 * start date: 15/11/2019
 * finish date: 15/11/2019
 *
 * This program takes in some text, tests is in a loop to see if each character is a digit or not 
 * if it not the loop breaks. Then when complete a test is performed to see if the times the loop is
 * performed is equal to the characters in the text, if it is then you enter a whole number if not
 * then you didn't.
 */

import java.util.Scanner;
public class Exercise4{
	public static void main(String args[])
	{
		String text;
		int count = 0, digit = 0;
		char character;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a piece of text: ");
		text = input.nextLine();
		
		while(count < text.length())
		{
			character = text.charAt(count);

			if(character >= '0' && character <= '9')
				digit++;
				
			else
				break;
			
			count++;
		}
		
		if(count == text.length())
			System.out.println("\nYou entered a positive whole number");
			
		else
			System.out.println("\nYou did not enter a positive whole number");		
	}
}