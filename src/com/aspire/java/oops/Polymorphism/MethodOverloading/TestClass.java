package com.aspire.java.oops.Polymorphism.MethodOverloading;

public class TestClass {
	
	public static void main(String[]args)
	{
		
		Child ch=new Child();
		
		ch.addition();
		ch.addition(22);
		ch.addition("ATI");
		ch.addition(1, 20);
		ch.addition(22.32f, 23);
		ch.addition(20, 1.1f);
		ch.addition(14, 23, 41, 12);
	}

}
