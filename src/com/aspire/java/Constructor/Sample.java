package com.aspire.java.Constructor;

public class Sample {
	
	int a,b,c;
	
	Sample()
	{
		a=10;
		b=20;
	}
	
	public static void main(String[]args)
	{
		Sample object=new Sample();
		object.method();
		
	}
	
	public void method()

	{
		c=a+b;
		System.out.println(c);
	}

}
