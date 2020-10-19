package LabSheet8;
/* Java Program Exercise2
 * By: Faun Schutz
 * start date: 18/11/2019
 * finish date: 18/11/2019
 *
 * 
 */

import java.util.Scanner;
public class Exercise2{
	public static void main(String args[])
	{
		int power = 0; 
		
		while(Math.pow(2, power) <= 5000)
		{
			power++;
		}
		System.out.println("The lowest powerr of 2 which exceeds 5,000 is " + power);
	}
}