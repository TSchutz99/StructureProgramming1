package LabSheet4;
/* Exercise3 Java Program
 * by: Faun Schutz
 * start date: 11/10/2019
 * finish date: 11/10/2019
 * 
 * This program take the cost call rate of to different companies to various countries, along with a persons
 * total calls that month and the minuates spent calling various countries and gives you total cost that month 
 * and average cost per call.
 */
 
import java.util.Scanner;
public class Exercise3{
	public static void main(String args[])
	{
		String serviceAsString;
		char service;
		int totalNumM, numMinUSA, numMinAust, numMinRuss;
		final double COSTVUSA = 0.06f, COSTVAUST = 0.08f, COSTVRUSS = 0.24f, COSTEUSA = 0.19f, COSTEAUST = 0.85f, COSTERUSS = 0.92f;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Which service did you use for calls? (V - Vartec, E - Eircom): ");
		serviceAsString = input.nextLine().toUpperCase();
		
	    /*String serviceAsStringUp = serviceAsString.toUpperCase();
		service = serviceAsStringUp.charAt(0);*/
		service = serviceAsString.charAt(0);
		
		if(service!='V' && service!='E') //if(!(service=='V'|| service=='E'))
		{
			System.out.println("Sorry - incorrect chioce, it must be (V)artec or (E)ircom .... Goodbye");
			System.exit(0);
		} 
		
		else 
		{
			System.out.print("Please enter Total number of calls made in the month: ");
			totalNumM = input.nextInt();	
			
			if(totalNumM == 0)
			{
				System.out.println("Thank you for your time .... Goodbye");
				System.exit(0);
			} 
			
			else
			{
				System.out.print("Please enter the number of minutes spent calling the USA: ");
				numMinUSA = input.nextInt();
				
				System.out.print("Please enter the number of minutes spent calling Australia: ");
				numMinAust = input.nextInt();
				
				System.out.print("Please enter the number of minutes spent calling Russia: ");
				numMinRuss = input.nextInt();
				
				if(service == 'V')
				{
					double totalCostM = (numMinUSA*COSTVUSA)+(numMinAust*COSTVAUST)+(numMinRuss*COSTVRUSS);
					System.out.println("The total cost of using the vartec service for the month is EUR" + 
						String.format("%.2f", totalCostM) +
						"\n\nThe average cost per call made is EUR" + 
						String.format("%.2f", totalCostM/totalNumM));
				} 
					
			 	else
			 	{
			 		double totalCostM = (numMinUSA*COSTEUSA)+(numMinAust*COSTEAUST)+(numMinRuss*COSTERUSS);
			 		System.out.println("The total cost of using the vartec service for the month is EUR" + 
						String.format("%.2f", totalCostM) +
						"\n\nThe average cost per call made is EUR" + 
						String.format("%.2f", totalCostM/totalNumM));
			 	}
			}
		}
	}
} 