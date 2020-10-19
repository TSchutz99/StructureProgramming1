package LabSheet7;
/* Java Program Exercise3
 * By: Faun Schutz
 * start date: 12/11/2019
 * finish date: 12/11/2019
 *
 * This takes in five peoples weight and then calculates the average weight
 * and the percentage of them that are over 80kg, and outputs the lightest/heaviest 
 * weight.
 */

import java.util.Scanner;
public class Exercise3{
	public static void main(String args[])
	{
		float weight, weight80 = 0, weightAdd = 0, heaviestWeight = 0, lightestWeight = 0; 
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(count < 5)
		{
			System.out.print("Please enter the weight of person " + (count+1) + ": ");
			weight = input.nextFloat();
			weightAdd = weightAdd + weight;
			
			if(weight >= 80)
				weight80++;
			
			if(count == 0){
				heaviestWeight = weight;
				lightestWeight = weight;
			}
			else{
				if(weight > heaviestWeight)
					heaviestWeight = weight; 
				else if(weight < lightestWeight)
					lightestWeight = weight;
			}
			count++;
		}
		
		System.out.println("\n\n\n==============================" +
						 "\n\tProgram Results" + 
						 "\n==============================" +
						 "\n\nAverage weight: " + String.format("%.2f", weightAdd/5f) + "kg" + 
						 "\n\nPercentage >= 80kg: " + String.format("%.2f", (weight80*100)/5) + "%" + 
						 "\n\nHeaviest weight: " + String.format("%.2f", heaviestWeight) + "kg" +
						 "\n\nLightest weight: " + String.format("%.2f", lightestWeight) + "kg");
	}
}