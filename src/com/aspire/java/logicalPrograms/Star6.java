package com.aspire.java.logicalPrograms;

public class Star6 {
	public static void main(String[]args)
	{
		
		
		for(int row1=1; row1<=5;row1++)
		{
			for(int space1=4;space1>=row1;space1--)
			{
				System.out.print(" ");
			}
			for(int star1=1;star1<=row1;star1++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int row2=1;row2<=4;row2++)
		{
			for(int space2=1;space2<=row2;space2++)
			{
				System.out.print(" ");
			}
			for(int star2=4; star2>=row2;star2--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
