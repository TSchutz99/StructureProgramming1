package LabSheet3;
/* Exercise2 Java Program
 * by: Faun Schutz
 * start date: 30/09/2019
 * finish date: 30/09/2019
 *
 * This is a program to calculate the volume of a cylinder
 */
 
import java.util.Scanner;
public class Exercise2{
	public static void main(String args[])
	{
		final float PI = 3.142f;
		float radius, height;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("please enter the radius of the cylinder: ");
		radius = input.nextFloat();
		
		System.out.print("please enter the height of the cylinder: ");
		height = input.nextFloat();
	
		float volume = PI*(radius*radius)*height;
		
		System.out.println("\n\n=====Calculations Result=====\n\nVolume of cylinder is " + 
			String.format("%.2f", volume) + " metres Squared");	
	}
}