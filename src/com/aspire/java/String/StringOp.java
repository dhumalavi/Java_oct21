package com.aspire.java.String;

public class StringOp {
	
	

	public static void main (String[]args)

	{
		String s1="Aspire";
		String s2="Training Institute";
		String s3=" ";
		String s4="Pune";
		
		String s5=s1.concat(s3.concat(s2));
		
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s3.concat(s2)));
		
		System.out.println((s1.concat(s3)).concat(s2));
		
		System.out.println(s1.concat(s4));
		
		System.out.println(s5);
		
		
		System.out.println(s1.substring(0));
		System.out.println(s2.substring(7));
		System.out.println(s2.substring(s2.indexOf('I')));
		
		System.out.println(s2.substring(2, 10));
		
		System.out.println(s1.substring(1, 3));
		System.out.println(s2.substring(s2.indexOf('i'), s2.lastIndexOf('i')+1));
		System.out.println(s2.substring(s2.lastIndexOf('i'), s2.lastIndexOf('i')));
		
	}
}
