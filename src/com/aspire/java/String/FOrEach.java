package com.aspire.java.String;

public class FOrEach {
	
	public static void main(String[] args) {
		

		String s="Dhumal Avinash";
		
		String s1="Shrimant";
		
		String s3=" ";
		
	System.out.println(s.toLowerCase());	
	
	System.out.println(s.toUpperCase());
		
	System.out.println(s.equalsIgnoreCase(s1));
	
	System.out.println((s.concat(s3)).concat(s1));
	
	System.out.println(s1.contains(s3));
				
		System.out.println(s.charAt(4));
		
		System.out.println(s.startsWith("Dh"));
		System.out.println(s.endsWith("Avinash"));
		
		System.out.println(s.substring(7));
		System.out.println(s.substring(0, 14));
		
		
		System.out.println(s.replace("Avinash", "Nilesh"));
		
		
		String[] s4=s.split("vi");
		
		for(String s5:s4)
		{
			
			System.out.println(s5);
		}
		
		for (int i=0; i<s4.length; i++)
		{
			
			System.out.println(s4[i]);
		}
		
		
		
		
		
		
		
		
//		String s1="Aspire Training Institute Pune";
//		
//		int[]b= {4,6,7,8};	
//		
//		String[] a=s1.split("");
//		
//		System.out.println(a.length);
//		
//		for (int i=0; i<a.length; i++)
//			
//			System.out.print(a[i]+"");
//		System.out.println();
//		
//		for(String s:a)                   //<-------java 8 advantage over old for loop
//		{
//			System.out.print(s+" ");
//		}
//		System.out.println();
//
//		for(int d:b)
//		{
//			System.out.print(d+",");
//		}
	}

}
