package com.aspire.java.logicalPrograms;

import java.util.Scanner;
public class AtmScanner {
	
	public static void main(String[]args)
	{
		
		
		
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Enter password");
			int pwd=scan.nextInt();
			
			System.out.println("Enter Amount");
			int amount=scan.nextInt();
			
			if (amount % 2==0)
				
				System.out.println(amount+ "is odd no");
			
			else
				System.out.println(amount +" is even no");
			
			
			System.out.println("Password is ="+pwd);
			
			System.out.println("Amount is ="+amount);
			/*Scanner scan = new Scanner(System.in);
			    System.out.println("Enter your password: ");
			    int pwd=scan.nextInt();
			    System.out.println("Enter amount: ");
			    int amount =scan.nextInt();
			    System.out.println("Password is ="+pwd);
			    System.out.println("Amount is ="+amount);*/
		}

	}

}
