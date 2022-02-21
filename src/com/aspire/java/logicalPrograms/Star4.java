package com.aspire.java.logicalPrograms;

public class Star4 {
	
	public static void main(String[]args)
	{
		for(int row1=1; row1<=4; row1++)
		{
			
			for(int space=1; space<=3; space++)
			{
				System.out.print(" ");
				
				for(int star=4; star>=1; star--) 
				{
					
					System.out.print("*");
				}
				
				System.out.println();
			}
			
		}
	}

}
