package MyCA_Copys.Second_CA;
/* Java Program FaunSchutz
 * By: Faun Schutz
 * start date: 08/11/2019
 * finish date: 
 *
 * This Program takes in various inputs and then determins what you water bill is based on your county and several
 * other factors.
 */
 
import java.util.Scanner;
public class FaunSchutz{
	public static void main(String args[])
	{
		String privateWater, septicTank, waterMeter; //county;
		//char privateWater, septicTank;
		int litresWater;
		final float DUBLINCENTPERLITRE = .224, CENTPERLITRE = .267;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Do you have a private water supply (y or n)?: ");
		privateWater = input.nextLine().toLowerCase();
		//privateWater = privateWaterAS.charNext();
		
		System.out.print("Do you have a septic tank (y or n)?: ");
		septicTank = input.nextLine().toLowerCase();
		//septicTank = septicTankAS.charNext();
		
		if(privateWater.equals"y" && septicTank.equals "y")
			System.out.print("\n\nYou are not a customer of Irish Water so your bill is EUR0.00");
		
		System.out.print("\n\nDo you have a water meter installed (y or n)?: ");
		waterMeter = input.nextLine().toLowerCase();
			
		if(privateWater.equals "n" && septicTank.equals "y" && waterMeter.equals "n")
			System.out.print("\n\n\nYour Annual Bill for Irish Water Service is EUR212.00");
			
		else{			
			System.out.print("\n\nPlease enter your county: ");
			//county = input.nextLine();
			
			System.out.print("\n\nPlease enter the number of litres used last year: ");
			litresWater = input.nextInt();
			
			if(privateWater.equals "n" && septicTank.equals "y" && waterMeter.equals "y")
				System.out.print("\n\n\nYour annual Bill for Irish Water Services is EUR" + (litresWater-30000)*DUBLINCENTPERLITRE);
			
			else if(privateWater.equals "n" && septicTank.equals "n" && waterMeter.equals "y")
				System.out.println("\n\n\nYour annual Bill for Irish Water Services is EUR" + (litresWater-30000)*CENTPERLITRE);	
		}
	}	
}
