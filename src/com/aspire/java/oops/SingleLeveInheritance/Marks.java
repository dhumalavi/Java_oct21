package com.aspire.java.oops.SingleLeveInheritance;

import java.util.Scanner;

public class Marks extends Student

{	
	
	int mark1=10;
	int mark2=30;
	

	public void studentmarks()

	{
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter Mark1");
	mark1=scan.nextInt();
	
	System.out.println("Enter Mark2");
	mark2=scan.nextInt();
		

	System.out.println("Mark1 ="+mark1);
	System.out.println("mark2="+mark2);

	}
}
