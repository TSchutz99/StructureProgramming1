package LabSheet3;
/* ArithmeticOperatorsFormated Java Program
 * By: Faun Schutz
 * Date start: 30/09/2019
 * Date finish: 30/09/2019
 * 
 * This is a program which takes two inputted numbers and then performs various 
 * Arithmettic Operations with them and them out outputs the result information.
 */
 
import java.util.Scanner;
public class ArithmeticOperatorsFormated{
	public static void main(String args[])
	{
		float firstNumber, secondNumber;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter any number: ");
		firstNumber = input.nextFloat();
		
		System.out.print("Please enter another number: ");
		secondNumber = input.nextFloat();
		
		System.out.println("\n\n************Results of Arithmetic Operatiors************\n\n" +
			firstNumber + " + " + secondNumber + " is " + String.format("%.3f",(firstNumber + secondNumber)) + "\n" +
			firstNumber + " - " + secondNumber + " is " + String.format("%.3f",(firstNumber - secondNumber)) + "\n" +
			firstNumber + " x " + secondNumber + " is " + String.format("%.3f",(firstNumber * secondNumber)) + "\n" +
			firstNumber + " / " + secondNumber + " is " + String.format("%.3f",(firstNumber / secondNumber)) + "\n" +
			firstNumber + " % " + secondNumber + " is " + String.format("%.3f",(firstNumber % secondNumber)));
	}
}