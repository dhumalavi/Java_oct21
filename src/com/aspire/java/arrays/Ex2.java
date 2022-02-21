package com.aspire.java.arrays;

//To find Average value of array element

public class Ex2 {
	
	public static void main(String[]args)
	{
		int [] Numbers= {20,30,25,35,-16,60,-100};
		
		int sum=0;
		
		for(int i=0; i<Numbers.length; i++)
		
			
		sum=sum+Numbers[i];
		
		double avg=sum/Numbers.length;
		
		System.out.println("Avarage value of array element is = "+avg);
			
	
	
	
	int [] v= {20,30,25,35,-16,60,-100};
	
	int su= 0 ;
	
	for(int a=0; a<v.length; a++)
		
		su= su+v[a];
		 
	
     double av=su/v.length;
    		 
    		 System.out.println("              "+av);
}
}
 