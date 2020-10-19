package MyCA_Copys.Second_CA;/* Java Program FaunSchutz
 * By: Faun Schutz
 * start date: 08/11/2019
 * finish date: 08/11/2019 
 *
 * This Program takes in various inputs and then determins what you water bill is based on your county and several
 * other factors.
 */
 
import java.util.Scanner;
public class FaunSchutzImproved{
	public static void main(String args[])
	{
		String privateWaterAS, septicTankAS, waterMeterAS, county;
		char privateWater, septicTank, waterMeter;
		int litresWater;
		final float DUBLINCENTPERLITRE = .00224f, CENTPERLITRE = .00267f;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Do you have a private water supply (y or n)?: ");
		privateWaterAS = input.nextLine().toLowerCase();
		privateWater = privateWaterAS.charAt(0);
		
		System.out.print("Do you have a septic tank (y or n)?: ");
		septicTankAS = input.nextLine().toLowerCase();
		septicTank = septicTankAS.charAt(0);
		
		if(privateWater == 'y' && septicTank == 'y'){
			System.out.println("\n\nYou are not a customer of Irish Water so your bill is EUR0.00");
			System.exit(0);
		}
		
		System.out.print("\n\nDo you have a water meter installed (y or n)?: ");
		waterMeterAS = input.nextLine().toLowerCase();
		waterMeter = waterMeterAS.charAt(0);
			
		if(waterMeter == 'n')
			System.out.println("\n\n\nYour Annual Bill for Irish Water Service is EUR212.00");
			
		else{			
			System.out.print("\n\nPlease enter your county: ");
			county = input.nextLine().toLowerCase();
			
			System.out.print("\n\nPlease enter the number of litres used last year: ");
			litresWater = input.nextInt();
			
			if(county.equals("dublin"))
				System.out.println("\n\n\nYour annual Bill for Irish Water Services is EUR" + 
									String.format("%.2f",(litresWater-30000)*DUBLINCENTPERLITRE));
			
			else
				System.out.println("\n\n\nYour annual Bill for Irish Water Services is EUR" + 
									String.format("%.2f",(litresWater-30000)*CENTPERLITRE));	
		}
	}	
}
