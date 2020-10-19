package LabSheet9;
/* Java Program Exercise2
 * By: Faun Schutz
 * Start: 25/11/2019
 * Finish: 25/11/2019
 *
 *  
 */

import java.util.Scanner; 
public class Exercise2{
	public static void main(String args[])
	{
		int posInteg = 1, sum = 0, upperLimit;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the upper limit: ");
		upperLimit = input.nextInt();
		
		for(int i=0; i!=upperLimit; i++)
		{
			sum = sum + posInteg;
			posInteg++;
			
		}
		System.out.println("\nThe sum of the first " + (posInteg-1) + " positive integers is " + sum);	
	}
}
 