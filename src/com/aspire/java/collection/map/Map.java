package com.aspire.java.collection.map;

import java.util.HashMap;

public class Map 
{
	
	public static void main(String[] args) 
	{
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//HashMap works on key value concept
		
		hm.put(1, "Avinash");
		hm.put(2, "priyanka");
		hm.put(4, "Priyanka");
		hm.put(5, "Rutuja");
		hm.put(5, "Vaibhav");
		hm.put(2, "Dhananjay");
		hm.put(3, "Dhananjay");
		
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsValue("Avinash"));
		
		for(int i=0; i<hm.size(); i++)
		{
			System.out.print(hm.get(i)+", ");
		}
		
		System.out.println();
		hm.remove(5);
		hm.put(6, "sagar");
		
		System.out.println(hm);
		
	}

}
