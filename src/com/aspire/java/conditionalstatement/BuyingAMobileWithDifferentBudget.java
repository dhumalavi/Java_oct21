package com.aspire.java.conditionalstatement;

public class BuyingAMobileWithDifferentBudget {
	
	public static void main(String[] args) {
		
		int prise=80000;
		
		if (prise<=10000) {
			
			System.out.println("Buy a Realme mobile with 32 MP Camara");
		}
        
		else if (prise<=20000) {
			
			System.out.println("Buy a Redmi mobile with 48 MP Camara"); 
		}
		
         else if (prise<=40000) {
			
			System.out.println("Buy a Samsung mobile with 64 MP Camara");
		}
		
		
		
         else if (prise<=60000) {
 			
 			System.out.println("Buy a Oneplus mobile with 108 MP Camara");
 		}
		
         else {
        	 
        	 System.out.println("Buy a Apple mobile with 108 MP Camara ");
         }
		
	}

}
