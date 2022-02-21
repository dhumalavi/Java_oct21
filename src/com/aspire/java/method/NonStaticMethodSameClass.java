package com.aspire.java.method;

import com.aspire.java.Differentpackmethod.DiffPackMethod;

public class NonStaticMethodSameClass {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		NonStaticMethodSameClass Object=new NonStaticMethodSameClass();
		
		Object.method11();
		Object.method12();
		
		NonStaticMethodDifferentClass Newobject=new NonStaticMethodDifferentClass();
		
		Newobject.method13();
		Newobject.method14();
		
		
		DiffPackMethod DPobject = new DiffPackMethod();
		
		
		DPobject.method15();
		DPobject.method16();
		DPobject.method12();
		
		
		
		
		
		System.out.println("End");
	}

	
	public void method11()
	
	{
		
		System.out.println("Non Static Method11 from Same Class");
	}
	
public void method12()
	
	{
		
		System.out.println("Non Static Method12 from Same Class");
	}
}
