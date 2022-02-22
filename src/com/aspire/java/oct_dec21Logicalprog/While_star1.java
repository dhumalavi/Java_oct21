package com.aspire.java.oct_dec21Logicalprog;

public class While_star1 
{

	public static void main(String[] args) {
		
		int row=1;
		
		while(row<=5)
		{
			int star=1;
			while(star<=row)
			{
				System.out.print("*");
				
				star++;
			}
			System.out.println();
			
			row++;
		}
	}
}
