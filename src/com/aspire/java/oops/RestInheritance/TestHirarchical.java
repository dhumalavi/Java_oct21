package com.aspire.java.oops.RestInheritance;

public class TestHirarchical {
	
	public static void main (String[]ags)
	{
		
		Child1 c1=new Child1();
		c1.openbrowser();
		c1.openflipcart();
		c1.entercredentials();
		c1.Mobileshopping();
		c1.payment();
		
		Child2 c2=new Child2();
		c2.openbrowser();
		c2.openflipcart();
		c2.entercredentials();
		c2.laptopshopping();
		c2.payment();
		
		Child3 c3=new Child3();
		
		c3.openbrowser();
		c3.openflipcart();
		c3.entercredentials();
		c3.DSLRcamarashopping();
		c3.payment();
	}

}
