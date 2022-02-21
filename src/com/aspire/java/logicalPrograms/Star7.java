package com.aspire.java.logicalPrograms;

//    *
//   ***
//  *****
// *******
//*********
public class Star7 {

	
	public static void main(String[]args)
	
	{
		for(int row=1; row<=5; row++) 
		{
			
			for(int space=4; space>=row; space--)
			{
				
				System.out.print(" ");
		}
			
			
				System.out.print("*");
				
				for(int star=0; star<=row-2;star++)
					
				{	
					System.out.print("**");
				}
			
		
		
	
		System.out.println();
		}
		
	}
}
