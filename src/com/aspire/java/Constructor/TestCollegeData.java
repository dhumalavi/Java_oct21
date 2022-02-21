package com.aspire.java.Constructor;

public class TestCollegeData {
	public static void main (String[]args)
	
	{
		
		CollegeData Object= new CollegeData();
		
		Object.StudentName="Avinsh Dhumal";
		Object.sMobNo=8552011;
		Object.sEmail="avi13495@gmail.com";
		Object.PrincipalName="xyz";
		Object.CollegeName="College of Engineering Phaltan";
		
		CollegeData Object1=new CollegeData();
		
		Object1.StudentName="Sunny Chavan";
		Object1.sMobNo=917245;
		Object1.sEmail="Chavan@gmail.com";
		//Object.PrincipalName="xyz";
	//	Object.CollegeName="College of Engineering Phaltan";
		
		System.out.println("Avinash's Information");
		Object.collegeinfo();
		
		System.out.println("Sunny's Information");
		Object1.collegeinfo();
		
	}
	
	

}
