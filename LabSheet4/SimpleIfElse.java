/* SimpleIf Java Program
 * by: Faun Schutz
 * start date: 07/10/019
 * finish date: 07/10/019
 * 
 * This Program uses simple if and else statment to determinate whether or not the user likes Java
 */
 
import java.util.Scanner;
public class SimpleIfElse{
	public static void main(String args[])
	{
		String answerAsString;
		char answer;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Do you like Java (y/n)? ");
		answerAsString = input.nextLine();
		
		answer = answerAsString.charAt(0);
		
		if(answer == 'y')
			System.out.println("\nYou said you like Java");
			
		else
			System.out.println("\nYou said you dislike Java");
	}
}