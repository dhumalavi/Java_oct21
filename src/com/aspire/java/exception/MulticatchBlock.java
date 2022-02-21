
package com.aspire.java.exception;

public class MulticatchBlock {
	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		int c=0;
		int d;
		int f;
		
		int[] ar= {1,2,3,4,5};
		
		try
		{
			try
			{d=ar[2]/c;
			}
			catch (ArithmeticException e) {

				System.out.println("Do not divide with zero");
				
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Selected index of array should be less than length");
			}
			
			
			f=ar[15]/c;
		}
		catch (ArithmeticException e) {

			System.out.println("Do not divide with zero");
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Selected index of array should be less than length");
		}
		
		finally
		{
			System.out.println("Finally Block Executed");
		}
	}

}
