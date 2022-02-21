package com.aspire.java.oops.SingleLeveInheritance;

import java.util.Scanner;

public class Student {
	
	int roll_no;
	String name;
	
	Student()
	{
		roll_no=10;
		
		name ="Avinash";		
	}

	public void studendetails()

	{
		
Scanner scan=new Scanner(System.in);
		
		roll_no=scan.nextInt();
		
		name=scan.toString();
				
	System.out.println("The Student Details are:");
	System.out.println("Roll no ="+roll_no);
	System.out.println("Student name="+name);
	}

}
