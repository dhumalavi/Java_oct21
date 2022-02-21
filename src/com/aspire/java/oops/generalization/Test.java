package com.aspire.java.oops.generalization;

public class Test {
	
	public static void main(String[]args)
	{
		System.out.println("Features from jio");
		
		Jio j=new Jio();
		
		j.audiocalling();
		j.sms();
		j.internet();
		j.Hotstar();
		
		System.out.println("Features from VI");
		
		VI v=new VI();
		v.audiocalling();
		v.sms();
		v.internet();
		v.Netflix();
		
	}

}


