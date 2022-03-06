package com.aspire.java.oct_dec21Logicalprog;

public class Duplicates_Array 
{
	public static void main(String []args)

	
	{
		int a[]= {1,2,4,53,56,10,56,2,2,2,56,56};
		
		int count=0,duplicate=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) 
				{	
					count++;
					duplicate=a[j];	
				}
				
				System.out.println(count);
				
			}
		
		}
		
		}
}
