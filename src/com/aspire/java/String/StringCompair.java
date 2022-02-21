package com.aspire.java.String;

public class StringCompair {
	
	public static void main(String[]args)
	{
		
		String s1="";
		String s2="Aspire";
		String s3="aspire";
		String s4="AspIRE";
		String s5=new String("Aspire");
		
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s2.equals(s3));
		
		System.out.println(s2.equals(s5));
		
		System.out.println(s2.equalsIgnoreCase(s3));
		
		System.out.println(s4.equalsIgnoreCase(s5));
		
		
		
	}

}
