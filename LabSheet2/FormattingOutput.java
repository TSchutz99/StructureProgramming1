package LabSheet2;
// FormarringOutput Java Program
/* This is a Program that shows how to integer, String and floating-point vaniables 
 * can be formatted*/
 
public class FormattingOutput {
	public static void main(String args[])
	{
		String module1Name = "Mathamathics", module2Name = "Structred programing 1",
			   module3Name = "Web Development 1";
			   
	 	int module1Students = 64, module2Students = 84, module3Students = 62;
	 	
	 	float module1Mark = 72.031f, module2Mark = 61.845f, module3Mark = 72.774f;
	 	
	 	String formatString = String.format("%-35s%-10d%.1f\n%-35s%-10d%.1f\n%-35s%-10d%.1f",
	 						  module1Name,module1Students,module1Mark,module2Name,module2Students,
	 						  module2Mark,module3Name,module3Students,module3Mark);
	 						  
	 	System.out.println("Module Name			#Students Average Mark\n" + formatString);
	 						  
	}
} 