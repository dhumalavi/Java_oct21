package com.aspire.java.oops.casting.primitive;

public class Explicite {
	
	public static void main(String[]args)
	{
	
	double a=1000.10;
	float b;
	long c;
	int d;
	short e;
	byte f;
	
	b=(float)a;
	c=(long)a;
	d=(int)a;
	e=(short)a;
	f=(byte)a;
	
	System.out.println("Byte a="+a);
	System.out.println("short b="+b);
	System.out.println("int c="+c);
	System.out.println("long d="+d);
	System.out.println("Float e="+e);
	System.out.println("Double f="+f);
	
	}
	
}
