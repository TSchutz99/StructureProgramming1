package MyCA_Copys.First_CA;
// Java Program FaunSchutz
/* By: Faun Schutz
 * 27/09/2019
 *
 * A correction of my CA
 */
 
import java.util.Scanner;
public class FaunSchutz_Correction{
	public static void main(String args[])
	{
		String text1 = "Planet name: ", text2 = "Orbital Speed: ", text3 = "Number of Moons: ";
		String planet;
		float planetSpeed = 13.07367f;
		int noOfMoons;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the name of the planet: ");
		planet = input.nextLine();
		
		System.out.print("Please enter the number uf the moons of the planet: ");
		noOfMoons = input.nextInt();
		
		String formatString = String.format("\n\n\n\t++++++++++++++++++++++++++++" + 
							"\n\t\tPlanet Data\n\t++++++++++++++++++++++++++++\n\n\n" + 
							"%-20s%s\n%-20s%.3f km/s\n%-20s%d",
							text1,planet,text2,planetSpeed,text3,noOfMoons);
		
		System.out.println(formatString);
	}
}