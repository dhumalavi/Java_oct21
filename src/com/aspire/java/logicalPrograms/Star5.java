package com.aspire.java.logicalPrograms;

public class Star5 {
	
	public static void main(String[]args)
	{
		
		
		for (int i=1; i<=6; i++)
		{
			for(int space=5; space>=i; space--)
			{
				System.out.print(" ");
			}
			
			for(int j= 1 ; j<=i; j++)
				
			{
				System.out.print("*"+" ");
			}
			System.out.println();
	}
		tr();

}
	
	
	public static void tr()
	{
		
		for(int row =1; row<=6; row++)
			
		{
		for(int space=5; space>=row; space--)
		{
			
			System.out.print(" ");
			
		}
		for (int star=1; star<=row; star++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}