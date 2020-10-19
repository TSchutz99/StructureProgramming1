package LabSheet7;/* Java Program Exercise2
 * By: Faun Schutz
 * start date: 12/11/2019
 * finish date: 12/11/2019
 *
 * This program takes in a username and password and if they are correct then you get in if not 
 * you get a total of 3 chances to login if you still fail, a maessage will state that you have
 * been block.
 */

import java.util.Scanner;
public class Exercise2{
	public static void main(String args[])
	{
		String username, password;
		int count = 3;
		
		Scanner input = new Scanner(System.in);
		
		while(count > 0)
		{
			System.out.print("Please enter your username: ");
			username = input.nextLine();
			
			System.out.print("Please enter your password: ");
			password = input.nextLine();
			
			if(count > 1){
				if(!(username.equals("t00213674") && password.equals("JavA"))){
					System.out.println("\nInvallid username/password combination. " + (count-1) + " attempts remaining");
				}
				else{
					System.out.println("Welcome to the system!");
					System.exit(0);
				}
			}
			count--;
			
			if(count == 0){
				System.out.println("\nInvallid username/password combination. IP address noted. Banned for 24 hours");
				System.exit(0);
			}
		}			
	}
}