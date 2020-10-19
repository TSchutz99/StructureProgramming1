package LabSheet4;
/* Exercise1 Java Program
 * by: Faun Schutz
 * start date: 07/10/019
 * finish date: 07/10/019
 * 
 * This program takes you age and then output a mesage deppending on your age 
 */

import java.util.Scanner;
public class Exercise1{
	public static void main(String args[])
	{
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		age = input.nextInt();
		
		if(age >= 20)
			System.out.println("You are at least 20 years of age");
			
		else
			System.out.println("You are under 20 yours old");
	}	
}