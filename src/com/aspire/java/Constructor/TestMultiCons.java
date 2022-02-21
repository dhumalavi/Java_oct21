package com.aspire.java.Constructor;

public class TestMultiCons {
	
	public static void main(String[]args)
	{
		
//		MultiCons object=new MultiCons();
//		object.addition();
//		object.subtraction();
//		
//		MultiCons object1=new MultiCons(50,20);
//		
//		object1.addition();
//		object1.subtraction();
//		
//		MultiCons object2=new MultiCons(20,10,40);
//		
//		object2.addition();
//		object2.subtraction();
		
		MultiCons ob =new MultiCons();
		
		ob.addition();
		
		MultiCons bo= new MultiCons(20,40);
				
		bo.addition();
		
		MultiCons go = new MultiCons(20,85,65);
		go.addition();
	}

}
