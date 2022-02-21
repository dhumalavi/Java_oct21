package com.aspire.java.oops.Interface;

abstract public class Child implements Interface1,Interface2

{

	
	abstract public void method1();
	
	public void Method2() 
	{
		System.out.println("Method2 From Interface1");		
	}
	
	public void method3() 
	{		
		System.out.println("Method3 From Interface1");
	}		
	public void method4()
	{
		System.out.println("Method4 From Interface2");		
	}
	public void method5()
	{
		System.out.println("Method5 From Interface2");		
	}
	public void method6()
	{
		System.out.println("Method6 From Interface2");		
	}

}
