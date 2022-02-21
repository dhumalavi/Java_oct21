package com.aspire.java.collection.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class CombineCollection
{
	public static void main(String[] args)
	{
		int []a= {7,9,1,4,8,8,3,5,10};
		String []s=	{"Avinash","Vaibhav","Rutuja","Niklesh","Ashwini","Priyanka","Vaibhav"};
		
		System.out.println("**************ArrayList");
		
		ArrayList al = new ArrayList();////////most used
		
		for(int i=0;i<a.length;i++) 
		{
			al.add(a[i]);
		}
		
		for(String name:s)
		{
			al.add(name);
		}
		
		System.out.println(al);
		
		System.out.println("**************LinkedList");
		
		LinkedList ll = new LinkedList();
		
		for(int i=0;i<a.length;i++) 
		{
			ll.add(a[i]);
		}
		
		for(String name:s)
		{
			ll.add(name);
		}
		
		System.out.println(ll);
		
		System.out.println("************Vector");//////////currently not in use
		
		Vector v = new Vector();
		for(int i=0;i<a.length;i++) 
		{
			v.add(a[i]);
		}
		
		for(String name:s)
		{
			v.add(name);
		}
		
		System.out.println(v);
		
		System.out.println("**********Hasset");
		
		
		HashSet hs = new HashSet();
		
		for(int i=0;i<a.length;i++) 
		{
			hs.add(a[i]);
		}
		
		for(String name:s)
		{
			hs.add(name);
		}
		
		System.out.println(hs);
		
		System.out.println("************LinkedHasdet");
		
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		for(int i=0;i<a.length;i++) 
		{
			lhs.add(a[i]);
		}
		
		for(String name:s)
		{
			lhs.add(name);
		}
		
		System.out.println(lhs);
		
		System.out.println("*************TreeSet");
		
		TreeSet tr = new TreeSet();
		
		for(int i=0;i<a.length;i++) 
		{
			tr.add(a[i]	);
			
		}
		
		for(String name:s)
		{
			tr.add(name);
		}
		
		System.out.println(tr);
		
		System.out.println("************");
		
		
		System.out.println();
		
		
		
		/*package com.aspire.java.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList ();
		ll.add("Ajinkya");
		ll.add(1234567890);
		ll.add("abc@gmail.com");
		ll.add('A');
		ll.add(98.5f);
		ll.add(null);
		ll.add(98.5f);
		ll.add(null);
		ll.add("Nagar");
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.indexOf('A'));
		System.out.println(ll.lastIndexOf(98.5f));
		ll.add(50);
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		ll.remove("abc@gmail.com");
		System.out.println(ll);
		ll.remove(98.5f);
		System.out.println(ll);
		ll.set(6, 60);
		System.out.println(ll);
		int a=10;
		System.out.println(ll.get(6));
		System.out.println(a+(int)ll.get(6));		//object cast into int
		ll.remove("Nagar");
		System.out.println("For loop:-");
		for(int i=0; i<=ll.size()-1;i++)
		{
			System.out.print(ll.get(i)+", ");
		}
		System.out.println();
		System.out.println("Foreach loop:-");
		for( Object b:ll)
		{
			System.out.print(b+", ");
		}
		System.out.println();
//		int x = al.size();  			//similarity
		System.out.println("Iterator only in Forward:-");
		Iterator itr=ll.iterator();				//only forward direction
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
		System.out.println();
		System.out.println("List Iterator in Forward:-");
		ListIterator li = ll.listIterator();	//forward direction
		while(li.hasNext())
		{
			System.out.print(li.next()+", ");
		}
		System.out.println();
		System.out.println("List Iterator in Reverse:-");
		ListIterator lirev = ll.listIterator(ll.size());		//reverse direction
		while(lirev.hasPrevious())
		{
			System.out.print(lirev.previous()+", ");
		}
		System.out.println();
		System.out.println("Enumeration:-");
	}
}
package com.aspire.java.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 
{
	public static void main(String[] args) 
	{
		Vector v= new Vector();
		v.add("Ajinkya");
		v.add(1234567890);
		v.add("abc@gmail.com");
		v.add('A');
		v.add(98.5f);
		v.add(null);
		v.add(98.5f);
		v.add(null);
		v.add("Nagar");
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.indexOf('A'));
		System.out.println(v.lastIndexOf(98.5f));
		v.add(50);
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		v.remove("abc@gmail.com");
		System.out.println(v);
		v.remove(98.5f);
		System.out.println(v);
		v.set(6, 60);
		System.out.println(v);
		int a=10;
		System.out.println(v.get(6));
		System.out.println(a+(int)v.get(6));		//object cast into int
		v.remove("Nagar");
		System.out.println("For loop:-");
		for(int i=0; i<=v.size()-1;i++)
		{
			System.out.print(v.get(i)+", ");
		}
		System.out.println();
		System.out.println("Foreach loop:-");
		for( Object b:v)
		{
			System.out.print(b+", ");
		}
		System.out.println();
//		int x = al.size();  			//similarity
		System.out.println("Iterator only in Forward:-");
		Iterator itr=v.iterator();				//only forward direction
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
		System.out.println();
		System.out.println("List Iterator in Forward:-");
		ListIterator li = v.listIterator();	//forward direction
		while(li.hasNext())
		{
			System.out.print(li.next()+", ");
		}
		System.out.println();
		System.out.println("List Iterator in Reverse:-");
		ListIterator lirev = v.listIterator(v.size());		//reverse direction
		while(lirev.hasPrevious())
		{
			System.out.print(lirev.previous()+", ");
		}
		System.out.println();
		System.out.println("Enumeration:-");
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.print(en.nextElement()+", ");
		}
	}
}
*/
		
		
		
		
		
		
		
		
		
		
	}
	

}
