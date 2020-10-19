package LabSheet8;
/* Java Program DoWhile
 * By: Faun Schutz
 * start date: 19/11/2019
 * finish date: 19/11/2019
 *
 * 
 */

import java.util.Scanner;
public class DoWhile{
	public static void main(String args[])
	{
		int mark, totalMarks = 0, highestMark = 0, counter = 0; 
		
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.print("Please enter the mark of student " + (counter+1) + " (-1 to exit): ");
			mark = input.nextInt();
			
			if(mark == -1)
				break;
			
			if(mark > highestMark)
				highestMark = mark;
				
			totalMarks += mark; 
				
			counter++; 
				
		 	  
		}while(mark != -1);
		
		System.out.println("\n\nHightest mark was: " + highestMark + 
						   "\nAverage mark was: " + String.format("%.0f", (float)totalMarks/counter));
	}
}