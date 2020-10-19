package LabSheet4;
/* IfElse Java Program
 * by: Faun Schutz
 * start date: 07/10/019
 * finish date: 07/10/019
 * 
 * This Program uses an if-else statment to ask the user a question and give them a message 
 * based on their reply
 */
 
import java.util.Scanner;
public class IfElse{
	public static void main(String args[])
	{
		String answer;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is half a byte called - (one word please)? ");
		answer = input.nextLine();
		
		if (answer.toLowerCase().equals("nibble"))
			System.out.println("\nThat's the corect answer - well done!");
		else
			System.out.println("\nIncorect - it is a \"nibble\"");
	}
}