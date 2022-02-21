package com.aspire.java.Constructor;

public class MultiCons {

	int a,b;
	
	MultiCons()
	
	{
		a=10;
		b=20;
	}

	MultiCons(int c, int d)
	{
		a=c;
		b=d;
	}
	
	MultiCons(int x, int y, int z)
	
	{
		a=x;
		b=y*z;		
	}
	
	public void addition()
	{
		System.out.println("a+b="+(a+b));
	}
	
	public void subtraction()
	{
		System.out.println("a-b="+(a-b));
	}
	
}
