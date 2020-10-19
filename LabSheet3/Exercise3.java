package LabSheet3;
/* Exercise3 Java Program
 * by: Faun Schutz
 * start date: 30/09/2019
 * finish date: 04/10/2019
 *
 * This is a program to convert acers into hectares.
 */
 
import java.util.Scanner;
public class Exercise3{
	public static void main(String args[])
	{
		float acres;
		final float CONVERSION_FACTORS = 0.4046f;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an area in acres: ");
		acres = input.nextFloat();
		
		System.out.println("\n\nThis is equivalent to " + String.format("%.3f", acres * CONVERSION_FACTORS) + 
			" hectares");				
	}
}