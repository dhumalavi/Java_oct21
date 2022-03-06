package com.aspire.java.oct_dec21Logicalprog;

public class Extract_NO_Char
{
	public static void main(String[] args)
	{
		
		String s="My mob no is 123456";
		
		System.out.println("Remove Numbers From the given String");
		
		System.out.println(s.replaceAll("[0-9,]", ""));
		
		System.out.println();
		
		System.out.println("Print Numbers From the given String");
		
		System.out.println(s.replaceAll("[^0-9,]", ""));
	}

}
