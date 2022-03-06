package com.aspire.java.oct_dec21Logicalprog;

public class SumofArrayelement 
{
	public static void main(String[] args) 
	
	{
		
		int []a= {1,2,3,4,5};
		
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			
			sum=sum+a[i];
			
			double avg=sum/a.length;
			
			
		}
		System.out.println("Sum of Array = "+sum);
		
		double avg=sum/a.length;
		
		System.out.println("Avarage of array = "+avg);
	}

} 
