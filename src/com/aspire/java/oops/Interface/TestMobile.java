package com.aspire.java.oops.Interface;

public class TestMobile {
	
	public static void main(String[]args)
	{
	System.out.println("Redmi mobile properties");
	Redmi r=new Redmi();
	
	r.camera();
	r.battery();
	r.touchscreen();
	r.selficamera();
	r.ram();
	
	System.out.println("Samsung mobile Properties");
	Samsung s=new Samsung();
	
	s.battery();
	s.camera();
	s.selficamera();
	s.touchscreen();
	s.wirelessCharging();
	
	}
	

}
