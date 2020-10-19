package LabSheet6;
/* DataSentinelWhile2Improved Java Program
 * by: Faun Schutz
 * start date: 21/10/2019
 * finish date: 21/10/2019
 * 
 * This program uses a data-sentinal controlled while loop to mimic the actions
 * of a simple cash register machine.
 */
 
import java.util.Scanner;
public class DataSentinelWhile2Improved{
	public static void main(String args[])
	{
		float price, totalPrice = 0;
		int numProducts = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the price of product " + (numProducts) + 
			" (-1 to exit): ");
		price = input.nextFloat();
		
		while(price != -1)
		{
			totalPrice += price;
			numProducts++; 
				
			System.out.print("Please enter the price of product " + (numProducts) + 
				" (-1 to exit): ");
			price = input.nextFloat();
		}
		
		System.out.println("\nTotal products entered: " + (numProducts - 1) + "\nTotal price: EUR" + 
			String.format("%.2f", totalPrice));
	}
}