package com.aspire.java.conditionalstatement;

public class Elseif {
	
	public static void main(String[] args) {
		
		int marks=5;
           if(marks>100)
           {
			System.out.println("Please reenter the marks correctly/valid");
           }
			else if(marks>=75)
			{
			System.out.println("result = Pass with distinction");
			}
			else if(marks>60)
		    {
			System.out.println("result = Pass with 1st class");
			}
           else if(marks>=40)
           {
			System.out.println("result = Pass with 2st class");
			}
           else
           {
			System.out.println("result = fail");
			
			System.out.println("Try next time");
			}	
           
           
	}

}
