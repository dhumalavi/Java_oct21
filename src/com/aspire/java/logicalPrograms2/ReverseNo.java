package com.aspire.java.logicalPrograms2;
// Reverse no
//num = 12345 rev=54321
public class ReverseNo 
{

	public static void main(String[] args) 
	
	{
		
		int num=20145;
		int rem=0, rev=0;
		
		while(num>0)
		{
			
			rem=num%10;
			rev=rev*10+rem;
			
			num=num/10;
		}
		
		System.out.println(rev);
//		
//		int num=12345;           //rem=num%10=5
//		int rev=0;
//		int rem=0;
//		
//		while(num>0)
//		{
//			rem=num%10;           //5, 4, 3 , 2 , 1
//			rev=rev*10+rem;       //5 , 54, 543 , 5432 , 54321
//			num=num/10;          //num=1234 , 123 , 12 , 1
//		}
//		
//		System.out.println("Reverse Number "+rev);
		
//		
//		int num=343;
//		int rev=0;
//		int rem=0;
//		int temp=num;
//		while(num>0)
//		{
//			rem=num%10;    //7
//			rev=rev*10+rem;//7
//			num=num/10;
//		}
//		
//	System.out.println("Reverse no "+rev);
//		
//		
//		
//	
	}
}
