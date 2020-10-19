package LabSheet3;
/* TypeCastingCharacters Java Program
 * by: Faun Schutz
 * start date: 04/10/019
 * finish date: 04/10/019
 * 
 * This program shows another possible use of type-casting
 */
 
public class TypeCastingCharacters{
	public static void main(String args[])
	{
		int ASCIICodeDegree = 176, ASCIICodeRegistration = 174;
		
		System.out.println("The ASCII code of the degree symbol is " + ASCIICodeDegree +
			"\nThe symbol for this character is " + (char)ASCIICodeDegree);
			
		System.out.println("The ASCII code of the registration symbol is " + 
			ASCIICodeRegistration +
			"\nThe symbol for this character is " + (char)ASCIICodeRegistration);
	}
}