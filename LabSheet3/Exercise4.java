/* Exercise3 Java Program
 * by: Faun Schutz
 * start date: 04/10/2019
 * finish date: 04/10/2019
 *
 * This is a program to convert acers into hectares.
 */
 
import java.util.Scanner;
public class Exercise4{
	public static void main(String args[])
	{
		System.out.println("************Distance Calculator************");
		
		float intitialSpeed, acceleration, timeTraveling;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\nPlease enter the initial speed: ");
		intitialSpeed = input.nextFloat();
		
		System.out.print("Please enter the acceleration: ");
		acceleration = input.nextFloat();
		
		System.out.print("Please enter the time spent traveling: ");
		timeTraveling = input.nextFloat();
		
		double square = Math.pow(timeTraveling, 2);
		
		System.out.println("\n\nThe object traveled a distance of " + 
			String.format("%.2f",(intitialSpeed * timeTraveling) + ((1/2f)* acceleration * square)) + 
				" metres");
		
	  /*Test to see if my formula works.
	    double traveledDistance;
		
		double square = Math.pow(timeTraveling, 2);
		
		traveledDistance = (intitialSpeed * timeTraveling) + ((1/2f)* acceleration * square);
		
		System.out.println(traveledDistance);*/
	}
}