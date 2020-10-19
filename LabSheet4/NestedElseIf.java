package LabSheet4;
/* NestedElseIf Java Program
 * by: Faun Schutz
 * start date: 11/10/2019
 * finish date: 11/10/2019
 * 
 * This program uses a nested else-if statementto determine the number of days in  a
 * particular month.
 */
 
import java.util.Scanner;
public class NestedElseIf{
	public static void main(String args[])
	{
		int monthNumber, daysInMonth;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("please enter the month number: ");
		monthNumber = input.nextInt();
		
		if(monthNumber == 1)
				daysInMonth = 31;
		else if(monthNumber == 2)
				daysInMonth = 28;
		else if(monthNumber == 3)
				daysInMonth = 31;
		else if(monthNumber == 4)
				daysInMonth = 30;
		else if(monthNumber == 5)
				daysInMonth = 31;
		else if(monthNumber == 6)
				daysInMonth = 30;
		else if(monthNumber == 7)
				daysInMonth = 31;
		else if(monthNumber == 8)
				daysInMonth = 31;
		else if(monthNumber == 9)
				daysInMonth = 30;
		else if(monthNumber == 10)
				daysInMonth = 31;
		else if(monthNumber == 11)
				daysInMonth = 30;
		else 
				daysInMonth = 31;
				
		System.out.println("\nThe number of days in this month is " + daysInMonth);
	}
}