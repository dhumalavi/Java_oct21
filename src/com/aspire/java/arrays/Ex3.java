package com.aspire.java.arrays;

import java.util.Arrays;

//To insert an element at specific position of into array


public class Ex3 {
	
	public static void main(String[]args)
	
	{
		int [] OriginalAray= {22,44,5,86,97,63,45,78,52,44,58,65};
		
		int index_Position=5;
		int Newvalue=56;
		
		System.out.println("Original Array : "+ Arrays.toString(OriginalAray));
		
		for (int i=OriginalAray.length-1; i>index_Position; i--)
			
		{
			OriginalAray[i]=OriginalAray[i-1];
		}
		OriginalAray[index_Position]=Newvalue;
		
		System.out.println("New Array : "+Arrays.toString(OriginalAray));
		
		
	}

}
