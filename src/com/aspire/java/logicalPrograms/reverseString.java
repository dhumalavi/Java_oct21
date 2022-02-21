package com.aspire.java.logicalPrograms;
// to reverse string
public class reverseString
{
	
	public static void main(String[] args) 
	
	{
		
		String Name="Avinash";
		
		String rev="";
		
		for (int i=Name.length()-1; i>=0; i-- )
		{
			rev=rev+Name.charAt(i);
		}
		System.out.println(rev);

//		String a="Avinash";
//		
//		String rev="";
//		for (int i=a.length()-1; i>=0; i--)
//		{
//			rev=rev+a.charAt(i);
//		}
//		System.out.println(rev);
		
		
//		String Name="avinash shrimant dhumal";
//		
//		String Rev="";
//		
//		for(int i= Name.length()-1; i>=0; i--)
//		
//		Rev=Rev+Name.charAt(i);
//		
//		System.out.println(Rev);
//		
//		String m= "123456789";
//		
//		String f="";
//		
//		for (int i= m.length()-1; i>=0; i--)
//			
//			f=f+m.charAt(i);
//		System.out.println(f);
//		
//		
		
		
		String a="avinash";
		
		String b="";
		
		for (int i=a.length()-1; i>=0; i--)
		
		{
			
			b=b+a.charAt(i);
			
		}
		
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
	}

}
