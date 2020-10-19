package LabSheet3;
/* RoundingNumbers Java Program
 * by: Faun Schutz
 * start date: 04/10/019
 * finish date: 04/10/019
 * 
 * This program shows another possible use of type-casting
 */
 
public class RoundingNumbers{
	public static void main(String args[])
	{
		float number1 = 15.56f, number2 = 15.46f;
		
		System.out.println("The value of the first number is " + number1 + 
			"\nTo the nearest whole number its " + String.format("%.0f", number1));
			
		System.out.println("\n\nThe value of the second number is " + number2 + 
			"\nTo the nearest whole number its " + String.format("%.0f", number2));
	}
}