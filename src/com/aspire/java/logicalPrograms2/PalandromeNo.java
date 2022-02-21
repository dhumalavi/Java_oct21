package com.aspire.java.logicalPrograms2;

// Palindrome Number
public class PalandromeNo 
{

	public static void main(String[] args) 

	{
//		int num=12345;           
//		int rev=0;
//		int rem=0;
//		int temp=num;
//		while(num>0)
//		{
//			rem=num%10;           
//			rev=rev*10+rem;       
//			num=num/10;       
//		}
//		
//		if(rev==temp)
//		{
//			System.out.println("Palaindrome Number");
//		}
//		else
//		{
//			System.out.println("Not Palaindrome Number");
//
//		}

		
		int num=54685215;
		int rev=0;
		int rem=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;	
		}
		
		System.out.println("Reverse numbee is "+rev);
		
		if (rev==temp)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}
