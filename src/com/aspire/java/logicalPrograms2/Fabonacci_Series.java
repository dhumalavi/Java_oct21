package com.aspire.java.logicalPrograms2;

// Fabonacci serie 0, 1, 1,2,3,5,8,13,21,34,55
public class Fabonacci_Series 
{

	public static void main(String[] args) 
	{
		
		int [] a=new int [20];

		a[0]=0;
		a[1]=1;

		for(int i=2; i<a.length; i++)
		{
		a[i]=a[i-1]+a[i-2];

		}

		for (int j=0; j<a.length; j++)

		{
		System.out.print(a[j]+", ");
		}
	
		
//		int []a=new int [20];
//		a[0]=0;
//		a[1]=1;
//		
//		for(int i=2; i<a.length; i++)
//		{
//			a[i]=a[i-1]+a[i-2];             // to store values in array
//		}
//		
//		for(int j=0;j<a.length; j++)          //to print values in arrays
//		{
//			System.out.println(a[j]);
//		}
		
//		int []a=new int [30];
//		
//		a[0]=0;
//		a[1]=1;
//		
//		for (int i=2; i<a.length; i++)
//		{
//			a[i]=a[i-1]+a[i-2];
//			
//		}
//		
//		for (int j=0; j<a.length; j++)
//		{
//			System.out.println(a[j]+", ");
//		}
//		
		
		
}
}
