package com.aspire.java.logicalPrograms;

public class RevNo 
{

	public static void main(String[] args) 
	{
		
//		long num=555666998877441122l;
//		long rev=0;
//		
//		while(num!=0)
//			{
//			rev=rev*10+num%10;
//			
//		num=num/10;
//			}
//		
//		System.out.println(rev);
	
	
//	int number=2255885;
//	
//	System.out.println(number);
//
//	int rev=0;
//	
//	while (num!=0)
//	{
//		
//	rev=rev*10+num%10;
//	
//	num=num/10;
//	}
//	System.out.println(rev);
//	
	
	
//	for(;number != 0;)
//	{
//	int remainder = number % 10;
//	 rev = rev * 10 + remainder;
//	number=number/10;
//	}
//	
//	System.out.println(rev);
//	
	
	
//	while(number !=0)
//	{
//		rev=rev*10+number%10;
//		
//		number=number/10;
//		System.out.println(number);
//		System.out.println();
//			
//	}
//	
//	
//	System.out.println(rev);	
//	
//	
//	
	
	int num=5432566;
	System.out.println("Original No="+num);
	int rev=0;
	
	for(;num!=0;)
	{
		rev=rev*10+num%10;
		
		num=num/10;
		
	}
	System.out.println("Reverse No = "+rev);
	
	}
		
	
}
