package com.aspire.java.oops.InheritancePractice;

import java.util.Scanner;

public class SubClass3 extends SuperClass {
	
	int M2;
	public void Marks()
	{

		Scanner Scan=new Scanner(System.in);
		
		 M2=Scan.nextInt();
		
		System.out.println("Marks obtained in M2 = "+M2);
	}
public void result()
	
	{
		
		if (M2>35)
		{
			System.out.println("Result = Pass");
		}
		else 
		{
			System.out.println("Result = Fail");
		}

}
}
