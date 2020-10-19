package LabSheet5;
/* DigitTest Java Program
 * by: Faun Schutz
 * start date: 17/10/2019
 * finish date: 17/10/2019
 * 
 * This program asks the user to enter a single keyboard character and determines whether 
 * it is a digit, Uppercase character or lowercase character.
 */
 
import java.util.Scanner;
public class Exercise2{
	public static void main(String args[])
	{
		char character;
		String characterAsString; 
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a keyboard character: ");
		characterAsString = input.nextLine();
		
		character = characterAsString.charAt(0);
		
		if(character >= '0'  && character <= '9')
			System.out.println("\nYou entered a Digit");
		else if(character >= 'A' && character <= 'Z')
			System.out.println("\nYou entered an Uppercase Letter");
		else if(character >= 'a' && character <= 'z')
			System.out.println("\nYou entered a Lowercase Letter");
		else 
			System.out.println("\nYou entered neither a Letter or a Digit");
	}
}