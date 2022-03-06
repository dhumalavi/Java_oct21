package com.aspire.java.oct_dec21Logicalprog;

public class Swap_No_Without3reVariable
{

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of a= "+a);
		System.out.println("value of b= "+b);
	}
}
