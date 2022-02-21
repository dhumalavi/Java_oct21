package com.aspire.java.String;

public class StringContent {
	
	public static void main(String[]args)

	{
		
		String s1="Aspire Training Institute Pune";
		String s2="aspire";
		String s3="PUNE";
		String s4="";
		String s5="in";
				
		System.out.println(s4.isEmpty());	
		System.out.println(s3.isEmpty());
		
		System.out.println(s1.charAt(21));
		
		char a =s1.charAt(21);
		System.out.println(a);
		
		System.out.println(s1.contains(s5));
		System.out.println();
		System.out.println(s1.contains("Aspire"));
		System.out.println((s1.toLowerCase()).contains(s2));
		
		
		System.out.println((s1.toUpperCase()).contains(s2.toUpperCase()));

		System.out.println(s1.indexOf('T'));
		
		System.out.println(s2.indexOf('i'));
		
		System.out.println(s1.lastIndexOf('i'));
		
		System.out.println(s1.startsWith("Aspire Training Institute"));
		
		System.out.println(s2.endsWith("e"));
	}
}
