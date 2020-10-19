package MyCA_Copys.Third_CA_Chritmas_Exam;
// Java Program FaunSchutz
/* By: Faun Schutz
 * start: 11/12/2019
 * finih: 11/12/2019
 *
 * This program takes in a unknown amount of names and then, gives you the fiffth name entered if there is one
 * the longest name, the verage numbers a charater in a name, pertage of names with 15 to 25 charaters, and a 
 * list of names containing e and r.
 */
 
import java.util.Scanner;
public class FaunSchutz{
	public static void main(String args[])
	{
		String personName, fifthPerson = "..... Sorry there were fewer than 5 names entered", longestName = "";
		int names = 0, allCharacters = 0, namesER = 0;
		float between15a25 = 0, percentageER;
		char character;
		
		Scanner input = new Scanner(System.in);
		
		while(names < 100)
		{
			System.out.print("Please enter a perosn's name (return to exit): ");
			personName = input.nextLine();
			
			if(personName.equals(""))
				break;
				
			if(personName.length() > 15 && personName.length() < 25)
				between15a25++;
					
			names++;
				
			if(names == 5)
				fifthPerson = personName;
				
			if(names == 1){
				longestName = personName;
			}else{
				if(longestName.length() < personName.length())
					longestName = personName; 	
			}
			
			allCharacters = allCharacters + personName.length();
					
			for(int i=0; i < personName.length(); i++)
			{
				personName.toLowerCase();
				character = personName.charAt(0);
				
				if(character == 'e' ||  character == 'r')
					namesER++;
			}
		}
		
		percentageER = (between15a25*names)/100f;
		
		if(names == 0){
			System.out.println("\n\nThere were no names entered ..... exiting program");
			System.exit(0);
		}else
			System.out.println("\n\n\n---------- Stats on Names Entered ----------" +
						 	   "\n\nThe fifth name entered is " + fifthPerson +
						 	   "\nThe longest name entered is " + longestName +
						 	   "\nThe average number of characters in the names entered is " + (allCharacters/names) +
						 	   "\nThe percentage of names containing between 15 to 25 characters is " + String.format("%.2f", percentageER) +
						  	   "\nThe list of names containing at least one 'e' and one 'r' character is: ");
	}
}