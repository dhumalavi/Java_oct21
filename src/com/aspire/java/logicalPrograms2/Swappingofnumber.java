package com.aspire.java.logicalPrograms2;

// Swapping of two Number
// a=20..........>a=10          By considering third temp variable
//b=10.............>b=20
public class Swappingofnumber {
	
	public static void main(String[] args)
	
	{
		
		int a=20;
		int b=10;
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("value of a= "+a );
		System.out.println("value of b= "+b);
		
	}

}
