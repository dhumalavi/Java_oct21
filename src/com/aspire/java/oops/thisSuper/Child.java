package com.aspire.java.oops.thisSuper;

public class Child extends Parant {
	
	int a=100;
	int b=200;
	int j=300;
	
	public void addition()
	{
		
		int a=10;
		int b=20;
		int k=30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(j);
		
	}
	
	
	
	
	/*
	int a=100;	//global non static variables
	int b=200;	//global non static variables
	int j=300;
	public void addtion()
	{
		int a=10;	//Local non static variables
		int b=20;	//Local non static variables
		int k=30;
		
		System.out.println("Local Variable a = "+a);
		System.out.println("Local Variable b = "+b);
//		System.out.println("Local Variable a+b = "+(a+b));
		System.out.println("Global from same class a = "+this.a);
		System.out.println("Global from same class b = "+this.b);
		System.out.println("Global from Parent class a = "+super.a);
		System.out.println("Global from Parent class b = "+super.b);
		
		int c=super.a+this.b+b;
		System.out.println(c);
		
		System.out.println("Global from parent class i="+i);
		System.out.println("Global from same class j="+j);
		System.out.println("Local varibale k="+k);
	
	}
	
	//Local variables from child class are not available to any other methods
*/
}
