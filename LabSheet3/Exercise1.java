package LabSheet3;
/* Exercise3 Java Program
 * by: Faun Schutz
 * start date: 30/09/2019
 *
 */
 
import java.util.Scanner;
public class Exercise1{
	public static void main(String args[])
	{
		int a = 5, b = 3, c = 2, x = a*b%c-4+6;
		
		System.out.print("The Value of a is 5\nThe value of b is 3\nThe value of c is 2\n\n" + 
			"The value of the experession a * b % c -4 + 6 is " + x + "\n");		
	}
}