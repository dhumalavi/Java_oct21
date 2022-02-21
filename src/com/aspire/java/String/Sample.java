package com.aspire.java.String;

public class Sample {
	
	public static void main(String[] args) {
		
		String s="Aspire Training Institute Pune";
		String s1="Aspire";
		String s2="Aspire";
		String s3= new String("Aspire");
		String s4= new String("Aspire");
		String s5="aspire";
		String s6=new String("aspire");
		
		
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s2==s4);
		System.out.println(s1==s5);
		System.out.println(s3==s5);
		System.out.println(s5==s6);

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s6));
		System.out.println(s5.equals(s6));
		
	}

}
