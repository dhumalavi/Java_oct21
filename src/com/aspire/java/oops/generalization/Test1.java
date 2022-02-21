package com.aspire.java.oops.generalization;

public class Test1 {
	
	public static void main(String[]args)
	
	{
		System.out.println("Jio1 properties");
		Jio1 j=new Jio1();
		
		j.audiocalling();j.Hotstar();j.internet();j.sms();
		
		System.out.println("VI1 properties");
		VI1 v=new VI1();
		
		v.audiocalling();v.internet();v.Netflix();v.sms();
	}

}
