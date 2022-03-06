package com.aspire.java.oct_dec21Logicalprog;

public class CharOccurance
{

	public static void main(String[] args) 
	{
		String s="Seleniun Testers Team";
		
		char a='z';
		int count=0;
		
		for(int i=0; i<=s.length()-1; i++)
		{
			char b=s.charAt(i);
		
		if(a==b)
		{
			count++;
		}		
		}
		System.out.println(count);
		
	}
}
