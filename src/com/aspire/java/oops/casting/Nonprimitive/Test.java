package com.aspire.java.oops.casting.Nonprimitive;

public class Test {
	
	public static void main(String[]args)
	
	{
		Child c =new Child();
		c.money();
		c.house();
		c.bike();
		
		Parant p= new Parant();
		p.money();
		p.house();
		p.jwellary();
		
		
		System.out.println("Up casting..................");
		
		Parant pc=new Child();
		pc.house();
		pc.money();
		pc.jwellary();
		
	}

}
