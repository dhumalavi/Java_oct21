package com.aspire.java.logicalPrograms;
import java.util.Scanner;
public class LogicalP {
	public static void main(String[]args)

	{
		Scanner Console =new Scanner(System.in);
		
		System.out.println("Enter any Positive Integer");
		int num=Console.nextInt();
		
		if (num>0  )
		{
			System.out.println("Ok");
		}
		
		else
		{
			System.out.println("Enter correct value");
		}
		
	}
}
