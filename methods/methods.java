package methods;

import java.util.Scanner;

public class methods {
	
	
		
		int a,b;
		
		void input_info()
		{
			Scanner sc  =  new Scanner(System.in);
			System.out.println("Enter two operands");
			 a= sc.nextInt();
			 b= sc.nextInt();
			

		}
		
		int sum()
		{
			return a+b;
		}
		
		int sub()
		{
			return a-b;
		}
		
		int mul()
		{
			return a*b;
		}
		
		int div()
		{
			return a/b;
		}
		
		void arthmetic()
		{
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			
		}

	}


