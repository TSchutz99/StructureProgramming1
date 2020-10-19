package LabSheet4;
/* NestedIf Java Program
 * by: Faun Schutz
 * start date: 08/10/019
 * finish date: 
 * 
 * This program uses nested if statement to make deciecision about dividing one number by another
 */
 
import java.util.Scanner;
public class NestedIf{
	public static void main(String args[])
	{
		float number1, number2 = -1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first number: ");
		number1 = input.nextFloat();
		
		if(number1 != 0)
		{
			System.out.print("Please enter seond number: ");
			number2 = input.nextFloat();
			
			if(number2 != 0)
				System.out.println(number1 + " divided by " + number2 + " is " + (number1/number2));
		}
		
		if(number1 == 0)
		{
			System.out.println("The answer must be zero since zero divided by anything (except zero) is zero");
		}
			
		if(number2 == 0)
		{
			System.out.println("The answer must be infinity since anything divided by zero is infinity");
		}
	}
}