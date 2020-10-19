package LabSheet2;
// Exercise3 Java Program
/* This is a short program that will take the user name, weight, hieght and address 
 * then it willdisplay that information*/
 
import java.util.Scanner;
public class Exercise3 {
	public static void main(String args[])
	{
		String name, address;
		float weight, height;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		name = input.nextLine();
		
		System.out.print("Please enter your weight (KG): ");
		weight = input.nextFloat();
		
		System.out.print("Please enter your height (feet): ");
		height = input.nextFloat();
		
		System.out.print("Please enter your address: ");
		address = input.nextLine();
		address = input.nextLine();
		
		System.out.println("\n\n-----------------------------------------\n" + 
			"\t\tDetails\n-----------------------------------------\n\nName: " 
			+ name + "\nWeight: " + weight + "\nHeight: " + height + 
			"\nAddress: " + address);
	}
}