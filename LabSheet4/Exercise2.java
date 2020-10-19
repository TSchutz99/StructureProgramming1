package LabSheet4;
/* Exercise2 Java Program
 * by: Faun Schutz
 * start date: 07/10/019
 * finish date: 07/10/019
 * 
 * This a program that will callculate a persons PAYE
 */

import java.util.Scanner;
public class Exercise2{
	public static void main(String args[])
	{
		int grossIncome, penisionPayments, cutOffPoint, taxCredits;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your Gross Income: ");
		grossIncome = input.nextInt();
		
		System.out.print("Please enter your Penision Payments: ");
		penisionPayments = input.nextInt();
		
		System.out.print("Please enter your Cut-off Point: ");
		cutOffPoint = input.nextInt();
		
		System.out.print("Please enter your Tax-credits: ");
		taxCredits = input.nextInt();
		
		final float PERCENTAGE1 = .2f, PERCENTAGE2 = .42f;
		
		if(grossIncome >= cutOffPoint)
			System.out.println("\nThe PAYE due by this employee is EUR" + 
				String.format("%.2f", +
					(((cutOffPoint*PERCENTAGE1))+((grossIncome-cutOffPoint-penisionPayments)*PERCENTAGE2)-taxCredits)));
		else
			System.out.println("\nThe PAYE due by this employee is EUR" + 
				String.format("%.2f", +
					((grossIncome-penisionPayments)*PERCENTAGE1)-taxCredits));		
	}
	
}