package com.aspire.java.logicalPrograms2;

public class InterchangeString 
{

	public static void main(String[] args) 
	{
		
		String a="aspire";
		String b="pune";
	
		String temp="";
		temp=a;
		a=b;
		b=temp;
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}
}
