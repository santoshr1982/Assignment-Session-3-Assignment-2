package Prime.Number;

import java.util.Scanner;


public class PrimeNumber {
	
	int iA;		//Declaration of variables.
	int i;
	int iFlag = 0; //Flag initialization.
	
	public void PrimeNo(int iC) 
	{
		iA = iC;	//Declaration of variables.
		for (i=1; i<=iC; i++) // For loop for to verify prime number.
		{
			
			if((iA % i) == 0)	// Finding the mode.
			{
				
				iFlag = iFlag+1; //Setting the flag. 
				
			}
			
		}
		
		if (iA ==1)	// This is to determine if the number is 1.
		{
			
			System.out.println("The number " + iA + " is a prime number"); // Printing the prime number.
			
		}
			
		else if(iFlag == 2) // checking the flag score.
		{
			
			System.out.println("The number " + iA + " is a prime number"); // Printing the prime number.
			
		}
		
		else
		{
			
			System.out.println("The number " + iA + " is not a prime number");
			
		}

		
	}
	public static void main(String[] args) {
	{
			int iB;	//Declaration of variable.
			Scanner sC = new Scanner(System.in);			// Declaring the object for accepting input.
			
			System.out.println("Please enter a number to know whether a number is prime or not:");
			iB = sC.nextInt();								//Accepting input.
			
			PrimeNumber Obj = new PrimeNumber();   			//	Creating object of the class.
			Obj.PrimeNo(iB);								// calling the method from the class.
			
	}
		
	}
}

