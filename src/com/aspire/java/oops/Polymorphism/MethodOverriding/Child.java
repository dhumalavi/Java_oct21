package com.aspire.java.oops.Polymorphism.MethodOverriding;

public class Child extends Parant{

public void mony ()
	
	{
	System.out.println("Child money = Rs 100000");
	}
	
public void farm ()
	
	{
	System.out.println("Child Farm =10 acre");
	}

public void car ()

{
	System.out.println("Child car= 2 ");
}

public void bike ()

{
	System.out.println("Child bike= 1 ");
}
/*public void DaughterInLaw()
{
	System.out.println("Parant Declear Final Keyword");
	
}*/

public static void jwellary()
{
	System.out.println("Class Declear static Keyword");
	
	
}

public void addition(int i, int j,int g)

{
	int k=2*i+2*j;
	System.out.println(" Addition" +k);
}

}
