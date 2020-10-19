package LabSheet8;
/* Java Program Exercise4
 * By: Faun Schutz
 * start date: 22/11/2019
 * finish date: 22/11/2019
 *
 * 
 */

import java.util.Scanner;
public class Exercise4{
	public static void main(String args[])
	{
		int year = 0;
		float interest = 0, amount = 1000;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the interest rate: ");
		interest = input.nextInt();
		
		do{
			System.out.println("Balance at the end of year " + (year+1) + 
				" is EUR" + String.format("%.2f", (amount+(amount*interest)/100)));
				
			year++;
			
			amount = (amount+(amount*interest)/100);
		}while((amount <= 2000));	
	}
}