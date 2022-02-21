package com.aspire.java.method;

public class CombinationReturnmethod {
	
	

	//Main method-->value-->another parameterized method-->addition--> retun sum value to main method

		    public static void main(String[] args)
	    {
	        int d=method(10,20);
	        System.out.println(d);

	        CombinationReturnmethod object= new CombinationReturnmethod();
	        int l=object.method2(10,20);
	        System.out.println(l);
	       
	        
	        
	        System.out.println(object.me());
	    }
	    public static int method(int a, int b)
	    {
	        int c;
	        c=a+b;
	        return c;
	    }
	    public int method2(int i, int j)
	    {
	        int k;
	        k=j-i;
	        return k;
	    }
	    
	    public  String me()
	    {
	    	String m="Avinash";
	    	return m;
	    }
	}



