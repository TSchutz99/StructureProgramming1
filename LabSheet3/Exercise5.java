/* Exercise3 Java Program
 * by: Faun Schutz
 * start date: 04/10/2019
 * finish date: 
 *
 * This is a program to convert acers into hectares.
 */
 
import java.util.Scanner;
public class Exercise5{
	public static void main(String args[])
	{
		final float GRAVITATIONAL_CONSTANT = 6.67300E-11f;
		float mass1, mass2;
		int distance;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the mass in kg of the first object: ");
		mass1 = input.nextFloat();
		
		System.out.print("Please enter the mass in kg of the second object: ");
		mass2 = input.nextFloat();
		
		System.out.print("Please enter the distance in metres between the objects: ");
		distance = input.nextInt();	
			
		double square = Math.pow(distance, 2);
			
		System.out.println("\n\n******Results of Program******\n\n" + 
			"\nThe mass of the first object is " + mass1 + " kg" + 
			"\nThe mass of the second object is " + mass2 + " kg" +
			"\nThe distance between the two objects is " + distance + " m" +
			"\nThe force exerted on the objects is " + GRAVITATIONAL_CONSTANT*mass1*mass2/square + " N");	
	}
}