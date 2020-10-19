package LabSheet5;
/* NestedElseIfImproved Java Program
 * by: Faun Schutz
 * start date: 14/10/2019
 * finish date: 14/10/2019
 * 
 * This program uses a nested else-if statementto determine the number of days in  a
 * particular month.
 */
 
import java.util.Scanner;
public class NestedElseIfImproved{
	public static void main(String args[])
	{
		int monthNumber, daysInMonth;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the month number: ");
		monthNumber = input.nextInt();
		
		if(monthNumber >= 1 && monthNumber <= 12)
		{
			if(monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12)
					daysInMonth = 31;
			else if(monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11)
					daysInMonth = 30;
			else 
					daysInMonth = 28;
					
			System.out.println("\nThe number of days in this month is " + daysInMonth);
		}
		
		else
			System.out.println("Invalid month");
				
		
	}
}