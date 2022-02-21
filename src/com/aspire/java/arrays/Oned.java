package com.aspire.java.arrays;

import java.util.Arrays;

public class Oned {
	
	public static void main(String[]args)
	{
		
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int []b= {11,12,13};
		int c[]= {14,15,16,17,18};
		char []d= {'A','B','C','D'};
		String[]e= {"Aspire","Training","Institute","pune"};
		
		int[] i=new int[7];
		
		i[0]=5;
		i[1]=6;
		i[2]=7;
		i[3]=8;
		i[4]=9;
		i[5]=10;
		i[6]=11;
		
		int [] x= {5,8,6,4,5,8,7,9,4,6,5,7,85,4,6,7,555,44,56,5,44,7,5};		
		
		
		Arrays.sort(x);
		
		for(int z=0; z<x.length; z++)
		{
			
			System.out.print(x[z]+", ");
		}
			
		System.out.println();
			
		for(int p=x.length-1; p>=0; p--)
		{
			
			System.out.print(x[p]+", ");
		}
		
		
		
		
		
		
		
//		
//		System.out.println("Length of i[]= "+i.length);
//		
//		System.out.println("Element of 3rd index in a[]="+a[3]);
//		
//		int sum=a[8]+b[2];
//		
//		System.out.println("a[8]+b[2]="+sum);
//		
//		for(int k=0; k<=a.length-1; k++)
//		{
//			System.out.print(a[k]+",");
//		}
//		System.out.println();
//		
//		
//		for(int j=0; j<=e.length-1; j++)
//		{
//			System.out.print(e[j]+" ");
//		}
//		System.out.println();
//		
//		int f[]= {22,36,45,888,77,45,699,554,778,996,1,55,5,8,9,5};
//		
//		Arrays.sort(f);
//		for(int l=0; l<f.length;l++)
//		{
//			System.out.print(f[l]+" ");
//		}
//		
//		System.out.println();
//
//		for(int m=f.length-1; m>=0; m--)
//		{
//			System.out.print(f[m]+" ");
//		}
	}

}
