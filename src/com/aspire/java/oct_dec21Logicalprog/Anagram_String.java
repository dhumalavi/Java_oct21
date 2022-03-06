package com.aspire.java.oct_dec21Logicalprog;

import java.util.Arrays;

public class Anagram_String 
{

	public static void main(String []args)

	{
	String s1="not";
	String s2="toN";

	
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	if(s1.length()==s2.length())
	{
	char [] a=s1.toCharArray();
	char [] b=s2.toCharArray();

	Arrays.sort(a);
	Arrays.sort(b);

//	boolean result=Arrays.equals(a,b);

//	System.out.println(result);

	if(Arrays.equals(a, b))
	{
	System.out.println("String is anagram");
	}

	else
	{
	System.out.println("String is not anagram String");

	}

	}
	else
	{
	System.out.println("String is not anagram String");
	}


	}
}
