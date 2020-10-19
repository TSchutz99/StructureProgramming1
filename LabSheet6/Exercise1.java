package LabSheet6;
/* DataSentinelWhile2Improved Java Program
 * by: Faun Schutz
 * start date: 21/10/2019
 * finish date: 22/10/2019
 * 
 * 
 */
 
import java.util.Scanner;
public class Exercise1{
	public static void main(String args[])
	{
		float fahren, celsius = 0, totalCelsius = 0, percentage;
		int totalConversions = 0, totalCelsius30 = 0, totalCelsius10 = 0, perCelsius20 = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the first Fahrenheit temperature (below -459.67 to exit): ");
		fahren = input.nextFloat();
		
		while(fahren >= -459.67)
		{
		
			celsius = (5/9f)*(fahren - 32);
			System.out.println("The equivalent Celsius temperature is " + String.format("%.3f", celsius));
		
			System.out.print("\nPlease enter another Fahrenheit temperature (below -459.67 to exit): ");
			fahren = input.nextFloat();
			if(celsius > 30)
				totalCelsius30++;
			else if(celsius < 10)
				totalCelsius10++;
				
			if(celsius >= 20)
				perCelsius20++;
				
			totalCelsius += celsius;
			totalConversions++;
		}
			//System.out.println("totalcelsius " + totalselcius);
		percentage = (float)perCelsius20/totalConversions*100;
			
		if(totalConversions == 0)
			System.out.println("No conversions were performed....Goodbye");
		
		else
		{
			System.out.println("\n\n==============================\n\tProgram Results\n==============================" +
				"\n\nTotal converisions performed: " + totalConversions + 
				"\nAverage Celsius temperature: " + String.format("%.3f", totalCelsius/totalConversions) + "C" +
				"\nTotal Celsius temperatures > 30C: " + totalCelsius30 + 
				"\nTotal Celsius temperatures < 10C: " + totalCelsius10 +
				"\nPercentage Celsius Temperatures >= 20C: " + String.format("%.0f", percentage) + "%");
		}				
	}
}