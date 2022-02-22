package com.aspire.java.oct_dec21Logicalprog;
//*****
//****
//***
//**
//*

//row=5; star=5;
public class Star_6 
{
public static void main(String[] args) 

{
	for(int row=1; row<=5; row++)
	{
		
		for(int star=5; star>=row; star--)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	
}
}
