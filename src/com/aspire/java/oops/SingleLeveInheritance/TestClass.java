package com.aspire.java.oops.SingleLeveInheritance;

public class TestClass {
	
	public static void main(String []args)
	{
		System.out.println("Child proerties");
		
		Child c=new Child();
		
		c.bike();
		c.iphone();
		c.money();
		
		System.out.println("Parant Properties"); 
		
		
		Parant p=new Parant();
		
		p.bunglow();
		p.car();
		p.farm();
		p.money();
		
	} 
	
	
}
