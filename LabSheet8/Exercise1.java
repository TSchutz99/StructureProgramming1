package LabSheet8;
/* Java Program Exercise1
 * By: Faun Schutz
 * start date: 18/11/2019
 * finish date: 18/11/2019
 *
 * This program uses a loop to find the largest negative integer whose cube is less then -15,000.
 */

public class Exercise1{
	public static void main(String args[])
	{
		int value = 0;
		
		while(Math.pow(value, 3) >= -15000)
		{
			value--;
		}
		System.out.println("The largest negative integer whose cube is less than -15,000 is " + value);
	}
} 