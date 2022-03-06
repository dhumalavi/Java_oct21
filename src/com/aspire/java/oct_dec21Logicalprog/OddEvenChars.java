package com.aspire.java.oct_dec21Logicalprog;

public class OddEvenChars 
{

	public static void main(String[] args)
	{
		
		String s="Selenium";    //s l n u  or  e e i m
		
		for(int i=0; i<=s.length()-1; i=i+2)
		{
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println();
		
		for(int j=1; j<=s.length()-1; j=j+2)
		{
			System.out.print(s.charAt(j)+" ");
		}
	}
}
