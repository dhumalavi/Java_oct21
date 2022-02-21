	
package com.aspire.java.collection.list;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//import al.iterator;

public class ArreyList1 {
	
	public static void main(String[]arg)
	
	{
		
		ArrayList al= new ArrayList();
		al.add("Avinsh");
		al.add(1234567890);
		al.add("avi@13495.com");
		al.add('A');
		al.add(null);
		al.add(98.5f);
		al.add(null);
		al.add(98.5f);
		al.add("Phaltan");
		
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al.indexOf('A'));
		System.out.println(al.lastIndexOf(98.5f));
		
		al.add(50);
		
		System.out.println(al);
		al.remove(5);
		System.out.println(al);
		
		al.set(3, 14);
		
		System.out.println(al);
		
		int a=10;

		System.out.println(al.get(6));
		
		System.out.println(a+(int)al.get(8));
		
		al.remove("Phaltan");
		System.out.println(al);
		
		System.out.println(al.size());
	
		System.out.println();
		System.out.println("For loop");
		for(int i =0; i<=al.size()-1; i++)
		{
			System.out.print(al.get(i)+",");
		}
		System.out.println();
		
		System.out.println("For each loop");
		for(Object b:al)
			
		{
			System.out.print(b+" , ");
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
	}

}
