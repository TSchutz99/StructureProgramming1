package LabSheet3;
/* DustanceConcerter Java Program
 * by: Faun Schutz
 * start date: 30/09/2019
 * finish date: 30/09/2019
 *
 * This is a program to read in a distance in yards and convert it to metres.
 */
 
import java.util.Scanner;
public class DistanceConverter{
	public static void main(String args[])
	{
		float yards;
		final float CONVERSION_FACTORS = 0.9144f;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Please enter the distance in yards: ");
	 	yards = input.nextFloat();
	 	
	 	System.out.println("\n\nThe equivalent distance in metres is " +  
	 		String.format("%.2f", CONVERSION_FACTORS*yards) + " metres");
	} 
}