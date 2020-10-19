package LabSheet9;
/* Java Program For
 * By: Faun Schutz
 * Start: 25/11/2019
 * Finish: 25/11/2019
 *
 * This program uses a loop which processes a piece of text entered by the user and determines 
 * the number of vowels and consonants it contains. 
 */
 
import java.util.Scanner;
public class For{
	public static void main(String args[])
	{
		int vowels = 0, consonants = 0;
		String text;
		char character; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a piece of text: ");
		text = input.nextLine().toLowerCase();
		
		for(int i = 0; i < text.length();i++)
		{
			character = text.charAt(i);
			if(character >= 'a' && character <= 'z')
			{
				if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
					vowels++;
				else
					consonants++;
			}
		}
		System.out.println("\n\nNumber of vowels: " + vowels + 
						   "\nNumber of consonants: " + consonants);
	}
} 