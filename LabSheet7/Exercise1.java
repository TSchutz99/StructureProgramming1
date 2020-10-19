package LabSheet7;
/* Java Program Exercise1
 * By: Faun Schutz
 * start date: 11/11/2019
 * finish date: 11/11/2019
 *
 * This takes in five peoples weight and then calculates the average weight
 * and the percentage of them that are over 80kg.
 */

import java.util.Scanner;
public class Exercise1{
	public static void main(String args[])
	{
		float weight, weight80 = 0, weightAdd = 0; 
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(count < 5)
		{
			System.out.print("Please enter the weight of person " + (count+1) + ": ");
			weight = input.nextFloat();
			weightAdd = weightAdd + weight;
			
			if(weight >= 80)
				weight80++;
			
			count++;
		}
		
		System.out.println("\n\n\n==============================" +
						 "\n\tProgram Results" + 
						 "\n==============================" +
						 "\n\nAverage weight: " + String.format("%.2f", weightAdd/5f) + "kg" + 
						 "\n\nPercentage >= 80kg: " + String.format("%.2f", (weight80*100)/5) + "%");
	}
}