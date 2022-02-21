package com.aspire.java.oops.Polymorphism.MethodOverloading;

public class Overloading {
	
	int a=20;
	
	public void addition()
	{
		int b=10;
		int c=a+b;
		
		System.out.println("Addition Method With No Parameter = "+c);
	}	
	public void addition(int d)
	{		
		int e=a+d;
		
		System.out.println("Addition Method With 1 int Parameter = "+e);
	}
	public void addition(int f, int g)
	{
		 int h=a+f+g;
		
		System.out.println("Addition Method With 2 int Parameter = "+h);
	}
	public void addition(String s)
	{
				
		System.out.println("Addition Method With 1 String Parameter = "+s);
	}
	
	public void addition(float i, int j)
	{
		float k =a+i+j;
		System.out.println("Addition Method With 1 float & 1 int Parameter = "+k);
	}
	
	public void addition(int l, float m)
	{
		float n =a+l+m;
		System.out.println("Addition Method With 1 float & 1 int Parameter = "+n);
	}
	
	
	
}
