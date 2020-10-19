package LabSheet8;
/* Java Program Exercise3
 * By: Faun Schutz
 * start date: 19/11/2019
 * finish date: 19/11/2019
 *
 * 
 */

public class Exercise3{
	public static void main(String args[])
	{
		int year = 1;
		float balance = 100000, withDraw = 12000;
		final float INVEST = .03f;
		
		while(balance > 12000)
		{
			System.out.println("Balance at the end of year " + (year) + 
				" is EUR" + String.format("%.2f", (balance+(balance*INVEST-withDraw))));
			balance = (balance+(balance*INVEST-withDraw));
			year++;
		} 
	}
}
