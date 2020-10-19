package LabSheet5;
/* Exercise1 Java Program
 * by: Faun Schutz
 * start date: 14/10/2019
 * finish date: /10/2019
 * 
 * This program takes several inputs and then determins if you are eligible to
 * join the Gardai.
 */
 
import java.util.Scanner;
public class Exercise1{
	public static void main(String args[])
	{
		int age;
		float height, weight;
		String gender, record, grade, irishCourse;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		age = input.nextInt();
		
		System.out.print("Please enter your height(Metres): ");
		height = input.nextFloat();
		
		System.out.print("Please enter your weight(Kiloes): ");
		weight = input.nextFloat();
				
		System.out.print("Please enter your gender (M of F): ");
		input.nextLine();
		gender = input.nextLine().toUpperCase();
		
		System.out.print("Do you have a crminal record(Y or N)? ");
		record = input.nextLine().toUpperCase();
		
		System.out.print("Did you recive at least a D grade in pass Irish in the Leaving Cert (Y or N)? ");
		grade = input.nextLine().toUpperCase();
			
		if(grade.equals("N"))
			System.out.print("\nDo you commit to taking a 10 week Irish course on application (Y or N)? ");
			irishCourse = input.nextLine().toUpperCase();
		
		if((age >= 18 && age <=35) && ((gender.equals("M") && height >= 1.85) || (gender.equals("F") && height >= 1.6)) && (weight < 100) && (record.equals("N") && ((grade.equals("Y") || irishCourse.equals("Y")))))
			System.out.print("Congratulations - You are eligible to Join the Gardai!");
			
		else
			System.out.println("Commiscration - You are not eligible to Join the Gardai.");  
	}
}