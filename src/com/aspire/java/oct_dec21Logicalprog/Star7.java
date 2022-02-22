package com.aspire.java.oct_dec21Logicalprog;
//    *
//   * *
//  * * *
// * * * *
//* * * * *

//row=5 stra=5 space=4
public class Star7
{

	public static void main(String[] args)
	{
		for(int row=1; row<=5; row++)
		{
			for(int space=4; space>=row; space--)
			{
				System.out.print(" ");
			}
			for(int star=1; star<=row; star++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=4; i++)
		{
			for(int s=1; s<=i; s++)
			{
				System.out.print(" ");
			}
			for(int j=4; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
