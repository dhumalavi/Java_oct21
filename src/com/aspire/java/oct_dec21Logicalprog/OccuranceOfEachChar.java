package com.aspire.java.oct_dec21Logicalprog;

import java.util.HashMap;

//write a program for each character

public class OccuranceOfEachChar 
{

	public static void main(String[] args)
	{
		String s="ramukaka";
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		for(int i=0; i<s.length(); i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				int count=hm.get(s.charAt(i));
				hm.put(s.charAt(i), ++count);
			}
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(hm);
	}
}
