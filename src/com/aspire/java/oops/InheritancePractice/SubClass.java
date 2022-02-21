package com.aspire.java.oops.InheritancePractice;

import java.util.Scanner;

public class SubClass extends SuperClass {
	int M1;
	public void Marks()
	{

		Scanner Scan=new Scanner(System.in);
		
		 M1=Scan.nextInt();
		
		System.out.println("Marks obtained in M1 = "+M1);
	}

}
