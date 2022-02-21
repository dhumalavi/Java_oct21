package com.aspire.java.logicalLoops;

public class Forloop {
	
	public static void main(String[]args)
	{
		System.out.println("Start");
		
	int j=18;
	int i;
	
	for(i=j; i>=10; i--)
	{
		System.out.println(i+"Hellow World");
	}
		System.out.println("End");
	}

}
/*[8:06 am, 01/12/2021] pramod mane sir: package com.aspire.java.logicalLoops;

			//

			public class ForLoop 
			{
			public static void main(String[] args) {
				System.out.println("Start");
				int j=40;
				int i;
				for(i=j;i>=20;i--)		//1+1+1+1+1+1
				{
					System.out.println(i+" Hello world");	//1	2 3 4 5 
				}
				System.out.println("end");
			}
			}
			[8:06 am, 01/12/2021] pramod mane sir: package com.aspire.java.logicalLoops;

			//50 to 100 all sum numbers

			public class ForLoop2 {
			public static void main(String[] args) {
				for(int i=50; i<=100; i=i+2)
				{
					System.out.println(i);
				}

			}
			}
			[8:06 am, 01/12/2021] pramod mane sir: package com.aspire.java.logicalLoops;

			//from 100 to 1

			public class ForLoop3 {
			public static void main(String[] args) {
				for(int i=100; i>=1;i--)
				{
					System.out.println(i);
				}
			}
			}
			[8:06 am, 01/12/2021] pramod mane sir: package com.aspire.java.logicalLoops;

			//10 times 1
			//10 times a string

			public class Forloop4 {
			public static void main(String[] args) {
				int j=5;
				String s="Aspire Training Institute";
				for(int i=1; i<=10;i++)
				{
					System.out.println(s);
				}
			}
			}
			[8:06 am, 01/12/2021] pramod mane sir: package com.aspire.java.logicalPrograms;
			//***

			public class Star1 {
			public static void main(String[] args) {
					for(int i=1;i<=5;i++)
					{
						System.out.print("*");
					}
			}
			}
			[8:06 am, 01/12/2021] pramod mane sir: package com.aspire.java.logicalPrograms;
			//*
			//*
			//*
			//*
			//*
			public class Star2 {
			public static void main(String[] args) {
				for(int i=1; i<=5;i++)
				{
					System.out.println("*");
				}
			}
				
			}
			[8:07 am, 01/12/2021] pramod mane sir: package com.aspire.java.logicalPrograms;
			//***
			//***
			//***
			//***
			//rows= 4 (i), columns=5(j)
			public class Star3 {
			public static void main(String[] args) {
				for(int i=1;i<=4;i++) // 1-->true,i++
				{
					for(int j=1;j<=5;j++)//j=1-->true-->body-->j++-->true-->body--------->j++-->false-->skip the inner for loop body
					{
						System.out.print("*");
					}
					System.out.println(); //This empty printing statement moves cursor to new line
				}
			}
			}
			[8:29 am, 01/12/2021] pramod mane sir: Assignment  1.12.2021

			1.
			11111
			22222
			33333
			44444

			2.
			12345
			12345
			12345
			12345

			3.
			12345
			678910
			1112131415
			1617181920

			4.
			12345
			23456
			34567
			45678
		
		}
	}

}
*/