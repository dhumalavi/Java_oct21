package com.aspire.java.logicalPrograms;

//   **
//  ****
// ******
//********

public class star8 {
	
public static void main(String[]args)
	
	{
		for(int row=1; row<=5; row++) 
		{			
			for(int space=4; space>=row; space--)
			{
				System.out.print(" ");
			}						
				System.out.print("1");
				
			for(int star=0; star<=row-2;star++)
			{	
				System.out.print("11");
			}
			    System.out.println();
		}
	}
}
