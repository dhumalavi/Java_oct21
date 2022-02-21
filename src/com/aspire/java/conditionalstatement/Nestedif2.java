package com.aspire.java.conditionalstatement;

public class Nestedif2 {
	
	public static void main(String[] args) {
		
		String UN="Prashant";
		String PWD="Prashant@123";
		System.out.println("Enter User name");
		
		if(UN=="Prashant") 
		{
			
			System.out.println("User name is in not correct");
			
		if(PWD=="Prashant@123")
		{
			System.out.println("Password is correct");
			System.out.println("Login to System succesfull");
			
		}
		
		else {
			
			System.out.println("Password is in correct");
		}
		}
		
		else {
			System.out.println("User name is in correct");
		}}}
			
			