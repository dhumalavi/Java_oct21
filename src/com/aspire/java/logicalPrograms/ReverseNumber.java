package com.aspire.java.logicalPrograms;

public class ReverseNumber {
	
	public static void main(String[] args) 
	{
//		int num = 10, reversed = 0;
//	    
//	    System.out.println("Original Number: " + num);
//
//	    // run loop until num becomes 0
//	    while(num != 0) {
//	    
//	      // get last digit from num
//	      int digit = num % 10;
//	      reversed = reversed * 10 + digit;
//
//	      // remove the last digit from num
//	      num /= 10;
//	    }
//
//	    System.out.println("Reversed Number: " + reversed);
//		
		
	    int OriginalNo=13495;
	
	System.out.println("Original No = "+OriginalNo);
	    int ReverseNo=0;
	    while(OriginalNo!=0)
	    {
	    	ReverseNo=ReverseNo*10+OriginalNo%10;
	    	OriginalNo=OriginalNo/10;
	    }
	    System.out.println("Reverse No = "+ReverseNo);
	  }
}





