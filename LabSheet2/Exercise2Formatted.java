package LabSheet2;
// Exercise2 Java Program
/* This is a program that a formatted verion of the earlier Exercise2 Program that I wrote*/

public class Exercise2Formatted {
	public static void main(String args[])
	{
		String module1Name = "Title:", module2Name = "Author:", module3Name = "Number of Pages:",
			   module4Name = "Year Published:", module5Name = "Price:";
		
		String moduleTitle = "Harry Potter and the Prisioner od Azkaban", moduleAuthor = "J.K. Rowing";
		
		int moduleNoPages = 317, moduleYearPub = 1999;
		
		float modulePrice = 35.5f;
		
		String modulePriceEUR = "EUR";
		
		String formatString = String.format("%-20s%s\n%-20s%s\n%-20s%d\n%-20s%d\n%-20s%s%.2f\n", 

									module1Name,moduleTitle,module2Name,moduleAuthor,module3Name,
									moduleNoPages,module4Name,moduleYearPub,module5Name,modulePriceEUR,modulePrice);
												
		System.out.println(formatString);		
	}	
}