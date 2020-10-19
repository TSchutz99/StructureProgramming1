package LabSheet6;
/* DataSentineWhile Java Program
 * by: Faun Schutz
 * start date: 21/10/2019
 * finish date: 21/10/2019
 * 
 * This program uses a data uses
 */
 
import java.util.Scanner;
public class DataSentinelWhile{
	public static void main(String args[])
	{
		float height, totalHeight = 0;
		int numProcessed = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the height of students " + (numProcessed + 1) + 
			" (-1 to exit): ");
		height = input.nextFloat();
		
		while(height != -1)
		{
			totalHeight = totalHeight + height;
			numProcessed =  numProcessed + 1;
			
			System.out.print("Please enter the height of students " + (numProcessed + 1) + 
				" (-1 to exit): ");
			height = input.nextFloat();
		}
		
		System.out.println("\n\nThe number of students processed is " + numProcessed + 
			"\nThe average height of the students is " + String.format("%.2f", totalHeight/numProcessed) + " m");
	}
}