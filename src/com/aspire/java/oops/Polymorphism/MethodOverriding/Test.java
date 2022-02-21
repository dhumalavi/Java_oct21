package com.aspire.java.oops.Polymorphism.MethodOverriding;

public class Test {
	
	public static void main(String[] args) {
		
		Parant p =new Parant();
		
		System.out.println("***********Parant Properties*********");
		p.mony();
		p.farm();
		p.Bunglow();
		p.car();
		
		System.out.println("*****Child Properties******");
		Child c= new Child();
		
		c.Bunglow();
		c.bike();
		c.mony();
		c.farm();
		c.car();
		c.addition(10, 10);
	}

}
