package com.aspire.java.oops.InheritancePractice;


public class TestClass {
	
	public static void main(String[]args)
	{
	
		System.out.println("Result of M1 Subject");
		Subclass2 Sub=new Subclass2();
		Sub.Name();
		Sub.RollNo();
		Sub.Marks();
		Sub.result();
		
		System.out.println("Result of M2 Subject");
		
		SubClass3 sub=new SubClass3();
		
		sub.Name();
		sub.RollNo();
		sub.Marks();
		sub.result();
	}

}
