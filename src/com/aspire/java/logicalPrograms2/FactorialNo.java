package com.aspire.java.logicalPrograms2;

// Factorial of 4=4*3*2*1
public class FactorialNo 
{

	public static void main(String[] args)

	{
		
		int num=6;
		
		int fact=1;
		
		for(int i=num; i>=1; i--)
			
		{
			fact=i*fact;
		}
		System.out.println(fact);
//		int num=4;
//	
//		int fact=1;
//		for(int i=num; i>=1; i--)
//		{
//			fact=i*fact;        //4*1=4
//			                    //3*4=12
//			
//	                            //2*12=24
//			                    //1*24=24
//		}
//		System.out.println("Factorial of "+num+" is "+fact);
//	
		
//		
//		int num=5;
//		int fact=1;
//		
//	//	for(int i=num; i>=1; i--) or
//			
//		for(int i=1; i<=5; i++)
//		{
//			fact=i*fact;
//		}
//		
//		System.out.println(fact);
//		
//		

	}
}
