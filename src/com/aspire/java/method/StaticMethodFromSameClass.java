package com.aspire.java.method;

import com.aspire.java.Differentpackmethod.DiffPackMethod;

public class StaticMethodFromSameClass {
	
	public static void main(String []args)
	{
		System.out.println("Main Method Start");
		
		method1();
		method2();
		
		
		DifferentClass.method3();
		DifferentClass.method4();
		
		
	    DiffPackMethod.method5();
	    DiffPackMethod.method6();
	    DiffPackMethod.method2();
	
		
		
		System.out.println("Main Method End");
	}
	
	
	public static void method1() 
	{
		System.out.println("Running static method1 in same class");
	}
	
	public static void method2()
	{
		System.out.println("Running static method2 in same class");
	}
	

}
