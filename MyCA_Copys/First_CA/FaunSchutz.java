package MyCA_Copys.First_CA;
// Java Program FaunSchutz
/* By: Faun Schutz
 * 27/09/2019
 */
 
import java.util.Scanner;
public class FaunSchutz{
	public static void main(String args[])
	{
		String text1 = "Planet name: ", text2 = "Orbital Speed: ", text3 = "Number of Moons: ";
		String planet;
		float planetSpeed;
		int noOfMoons;
		
		Scanner input = Scanner.input(System.in);
		
		System.out.print("Please enter the name of the planet: ");
		planet = input.nextLine();
		
		System.out.print("Please enter the number uf the moons of the planet: ");
		noOfMoons = input.nextInt();
		
		String formatString = String.format("\n\n\n\t++++++++++++++++++++++++++++++" + 
							"\n\t\t\t\tPlanet Data\n\n++++++++++++++++++++++++++++++\n\n\n" + 
							"%-20s%s\n%-20s%.3f km/s\n%-20s%d",
							text1,planet,text2,planetSpeed,text3,noOfMoons);
		
		System.out.println(formatString);
	}
}