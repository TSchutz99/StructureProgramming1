package LabSheet9;
/* Java Program Exercise1
 * By: Faun Schutz
 * Start: 25/11/2019
 * Finish: 25/11/2019
 *
 *  
 */
 
public class Exercise1{
	public static void main(String args[])
	{
		int posInteg = 1, sum = 0;
		
		/*int j=0;
		 *for(;;)
		{
			try{
			
			Thread.sleep(1000);
			System.out.println("\nLoop " + j++);
			}
			catch(InterruptedException e)
			{
	
				System.out.println("\nCaught exception!!");
			}
			
			if(j==10)
				break;
		}*/
		
		for(int i=0; i!=20; i++)
		{
			sum = sum + posInteg;
			posInteg++;
			
		}
		System.out.println("The sum of the first 20 positive integers is " + sum);
		
		
	}
}
 