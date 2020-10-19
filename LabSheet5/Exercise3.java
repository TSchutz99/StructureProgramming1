package LabSheet5;
/* EXercise3 Java Program
 * by: Faun Schutz
 * start date: 18/10/2019
 * finish date: 18/10/2019
 * 
 * This program ask for a number between one and three and depending on the number it will then either 
 * ask for the radius of a circle or a sphere and then give you a either the area or the volume, or it
 * wil quit the program and if you enter a number not tbetween onw and three then the program will say 
 * so.
 */

import java.util.Scanner; 
public class Exercise3{
	public static void main(String args[])
	{ 
		int choice;
		final float PI = 3.142f;
		float radius; 
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("\t\t\t1. Calculate the area of a circle" +
			"\n\t\t\t2. Calculate the volume of a sphere" +
			"\n\t\t\t3. Quit\n\nPlease enter your choice (1-3): ");
		choice = input.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.print("Please enter the radius of the circle: ");
				radius = input.nextFloat();
				
				System.out.println("The area of the circle is " + String.format("%.3f", PI*Math.pow(radius, 2)) + " metres squared");
				break;
			case 2:
				System.out.print("Please enter the radius of the sqhere: ");
				radius = input.nextFloat();
				
				System.out.println("The area of the circle is " + String.format("%.3f", (4/3f*PI*Math.pow(radius, 3))) + " metres cubed");
				break;
			case 3:
				System.out.println("Thanks for using the system. Goodbye!");
				break;
			default:
				System.out.println("Sorry - you must have entered an invalid choice - most be between 1 and 3");
		}	
	}
}