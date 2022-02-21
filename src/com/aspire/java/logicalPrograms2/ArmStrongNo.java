package com.aspire.java.logicalPrograms2;

// 153=1*1*1+5*5*5+3*3*3 =1+125+27 =sum of cube of all digigit is equal to no=   armstrong number

public class ArmStrongNo 
{
	public static void main(String[] args) 
	{
		
		int num= 154;
		int sum=0;
		int rem=0;
		int OriginalNo=num;
		
		
		while(num>0)
		{
			rem = num%10 ;   
			
			sum=sum+rem*rem*rem;
			
			num=num/10;
			
		}
		
		System.out.println(sum);
		
		
		if (sum==OriginalNo)
		{
			System.out.println("no "+OriginalNo+" is armstrong no");
		}
		
		else
		{
			System.out.println("no "+OriginalNo+" is not armstrong no");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	 while(num>0)
//	 {
//		 rem=num%10;                           // 3   5
//		 sum=sum+rem*rem*rem;                  // 0+3*3*3=27  27+5*5*5=152   152+1*1*1=153
//		 num=num/10;                           //15  1
//	 }
//	 
//	 if(OriginalNo==sum)
//	 {
//		 System.out.println(OriginalNo+" is Armstrong Number");
//	 }
//	 
//	 else
//	 
//	 System.out.println(OriginalNo+" is not Armstrong Number");
		
//		while(num>0)
//		{
//			
//			rem=num%10;  //3
//			sum=sum+rem*rem*rem;
//			num=num/10;
//					
//		}
//		
//		if (OriginalNo==sum)
//		{
//			System.out.println("No "+OriginalNo+" is armstrong no");
//		}
//		else {
//			System.out.println("Not armstrong no");
//		}
//
	}

}
