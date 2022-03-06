package com.aspire.java.oct_dec21Logicalprog;

public class Plandrome_No 
{

	public static void main(String[] args)
	{
		int num=151;
		int rev =0;
		int rem=0;
		int OriginalNo=num;
		while(num>0)
		{
			rem=num%10;  //1  5  1
			
			rev=rev*10+rem; //0+1 1*10+5=15   15*10+1=151
			
			num=num/10;  //15  1 0
			
		}
		System.out.println(rev);
		
		if(OriginalNo==rev)
		{
			System.out.println("No "+OriginalNo+ " is Palandrome no");
		}
		else
		{
			System.out.println("No "+OriginalNo+ " is not Palandrome");
		}
		
	}
}
