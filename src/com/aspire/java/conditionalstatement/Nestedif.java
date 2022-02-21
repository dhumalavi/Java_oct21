package com.aspire.java.conditionalstatement;

public class Nestedif {
	
	public static void main(String[] args) {
		
		
		int age=18;
		String gender="Male";
		if(age>=18)
		{
		System.out.println("Person is a legal voter");
		
		if(gender=="male"&&age<21)
		{
			System.out.println("The person dont have valid age for marriage");
		}
		else 
		{
			System.out.println("Valid age for marriage");
		}
			
		if(age<30) 
			{
			System.out.println("Eligible for apply gov job");
			}
		else 
			{
				System.out.println("Not eligible for apply gov job");
			}
		}
		
		
		else {
			
			System.out.println("Not a legal voter");
		}
	}

}
