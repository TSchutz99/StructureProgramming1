package LabSheet7;
/* Java Program CounterControlledWhile
 * By: Faun Schutz
 * start date: 11/11/2019
 * finish date: 11/11/2019
 *
 * This uses a counter controlled while loop to read in the names of exactly 
 * 10 people. It then processes these names in a number of ways. 
 */
 
import java.util.Scanner;
public class CounterControlledWhile{
	public static void main(String args[])
	{
		String name, namesOver20="", namesStartingWithA="";
		int totalLength = 0, count = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(count < 10)
		{
			System.out.print("Please enter the name of person " + (count+1) + ": ");
			name = input.nextLine();
			
			if(name.length()>20)
				namesOver20 += name + "\n";
				
			totalLength += name.length();
			
			if(name.charAt(0) == 'A')
				namesStartingWithA += name + "\n";
				
			count++;
		}
		
		System.out.println("\n\n\n=================" + 
						   "\n\tProgram Results" + 
						   "\n=================" + 
						   "\n\nList of names containing > 20 characters: \n" + namesOver20 + 
						   "\n\nList of names beginning with 'A': \n" + namesStartingWithA + 
						   "\nAverage length of the names: " + String.format("%.0f", totalLength/10f));
	}
}