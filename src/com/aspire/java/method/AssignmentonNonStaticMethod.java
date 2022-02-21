package com.aspire.java.method;

import com.aspire.java.Differentpackmethod.Assignment;

public class AssignmentonNonStaticMethod {
	
	public static void main(String[]args)
	{
		AssignmentonNonStaticMethod Object1=new AssignmentonNonStaticMethod();
		
		Object1.familymember1();
		Object1.familymember2();
		Object1.familymember3();
		
		Assignmentdiffclass Object2=new Assignmentdiffclass();
		
		Object2.relativename1();
		Object2.relativename2();
		
		Assignment Object3 = new Assignment();
		
		Object3.friendname1();
		Object3.friendname2();
		
		
	}
	public void familymember1()
	{
		System.out.println("Father Name Shrimant");
	}
	public void familymember2()
	{
		System.out.println("Mother Name Ujwala");

}
	
	public void familymember3()
	{
		System.out.println("Brother Name Nilesh");

}
}
