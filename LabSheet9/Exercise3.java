package LabSheet9;
/* Java Program Exercise3
 * By: Faun Schutz
 * Start: 27/11/2019
 * Finish: 27/11/2019
 *
 * This program takes an input and then gives you its times tables. 
 */

import java.util.Scanner; 
public class Exercise3{
	public static void main(String args[])
	{
		int number = 0, times = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What number do you wish to display the times-table for? ");
		number = input.nextInt();
		
		while(!(number >= 1 && number <= 12))
		{
			System.out.print("Invalid. You must enter a value from 1-12. Please re-enter: ");
			number = input.nextInt();
		}
		
		System.out.println("\n\n=====The 6 times table=====\n");
		
		for(int i=0; i!=13; i++)
		{
			System.out.println(number + " Times " + times + " is " + (number*times));
			times++;
		}		
	}
}