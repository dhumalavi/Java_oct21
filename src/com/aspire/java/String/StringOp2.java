
package com.aspire.java.String;

public class StringOp2 {
	public static void main(String[] args) {
		
		String s1="Aspire Training Institute Pune";
		
		String[] a=s1.split(" ");
		
	//	System.out.println(a.length);
		
		for (int i=0; i<a.length; i++)
			
			System.out.print(a[i]);
		System.out.println();
		
		for(int j=a.length-1; j>=0; j--)
		{
			System.out.print(a[j]+" ");
		}
		
//		System.out.println(s1.replace('i', 'I'));
//		
//		System.out.println(s1.replace("Aspire", "AspirePune"));
//		
//		System.out.println(s1.replace("Pune", "Mumbai"));
	}

}
