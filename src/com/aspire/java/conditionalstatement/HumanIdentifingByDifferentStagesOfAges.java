package com.aspire.java.conditionalstatement;

public class HumanIdentifingByDifferentStagesOfAges {
	
	public static void main(String[] args) {
		
		int age =1;
		if(age<=1) {
			System.out.println("Stage of age=Infant");}
		
		else if(age<=4) {
			System.out.println("Stage of age=Toddler"); }
			
			else if(age<=12) {
				
				System.out.println("Stage of age=Chield");}
			
			else if (age<=19) {
				
				System.out.println("Stage of age=Teen");
			}
			else if(age<=39) {
			
				System.out.println("Stage of age=Adult");
			}
		
			else if(age<=59)
				
				{System.out.println("Stage of age=Middle Age");}
		
			else {
				System.out.println("Stage of age=senior Adult");
			}
		
	}
	

}
