package LabSheet8;
/* Java Program TaskControlledWhile2
 * By: Faun Schutz
 * start date: 18/11/2019
 * finish date: 18/11/2019
 *
 * 
 */

import java.util.Scanner;
public class TaskControlledWhile2{
	public static void main(String args[])
	{
		int year = 0;
		float interest = 0, amount = 1000;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the interest rate: ");
		interest = input.nextInt();
		
		while((amount <= 2000))
		{
			System.out.println("Balance at the end of year " + (year+1) + 
				" is EUR" + String.format("%.2f", (amount+(amount*interest)/100)));
			year++;
			
			amount = (amount+(amount*interest)/100);
		}
	}
}