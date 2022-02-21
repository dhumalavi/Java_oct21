package com.aspire.java.arrays;

// to print pattern

public class Ex1 {
	
	public static void main(String[]args)
	{
		int [][]a=new int[10][10];
		
		
		for (int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();	
		}
		
	}

}
