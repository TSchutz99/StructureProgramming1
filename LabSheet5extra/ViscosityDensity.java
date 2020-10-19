package LabSheet5extra;
/* Java Program ViscosityDensity
 * By: Faun Schutz
 * 
 * Start date: 04/11/2019
 * finish date: 04/11/2019
 */

import java.util.Scanner; 
public class ViscosityDensity{
	public static void main(String args[])
	{
		float densityBall, densityFluid, radiusBall, velocityBall, acceleration = 9.8f;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("************Viscosity Calculator************" +
					     "\n\nPlease enter the density of the ball-bearing: ");
		densityBall = input.nextFloat();
		
		if(densityBall < 0){
			System.out.println("Error! The density of the ball-bearing must be positive ...... now quitting program");
			System.exit(0);
		}
			
		System.out.print("Please enter the density of the fluid: ");
		densityFluid = input.nextFloat();
		
		if(densityFluid < 0){
			System.out.println("Error! The density of the fluid must be positive ...... now quitting program");
			System.exit(0);
		}
			
		System.out.print("Please enter the radius of the ball-bearing: ");
		radiusBall = input.nextFloat();
		
		if(radiusBall < 0){
			System.out.println("Error! The radius of the ball-bearing must be positive ...... now quitting program");
			System.exit(0);	
		}
				
		System.out.print("Please enter the velocity of the ball-bearing: ");
		velocityBall = input.nextFloat();
		
		if(velocityBall < 0){
			System.out.println("Error! The velocity of the ball-bearing must be positive ...... now quitting program");
			System.exit(0);	
		}
		
		System.out.println("\n\nThe viscocity of the fluid is " + String.format("%.2f", (2*(densityBall-densityFluid))*(acceleration*Math.pow(radiusBall, 2))/(9*velocityBall)) +
			"a s");			
	}
}