package com.aspire.java.oct_dec21Logicalprog;

//Prime No 10-30
public class Prime_No 
{

	public static void main(String[] args) 
	{
		int lower=10;
		
		int Higher=30;
		
		for(int i=lower; i<=30; i++)
		{
			int count=0;
			
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
				count++;	
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
			
			
		}
	}
}
