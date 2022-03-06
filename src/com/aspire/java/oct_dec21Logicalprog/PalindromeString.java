package com.aspire.java.oct_dec21Logicalprog;

public class PalindromeString 
{
	public static void main(String[] args)
	{
		
		
		String a="Nayan";
		
		String rev="";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			rev=rev+a.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(a))
		{
			System.out.println("String is a Palindrome");
		}
		else
		{
			System.out.println("String is a not Palindrome");
		}
	}

}
