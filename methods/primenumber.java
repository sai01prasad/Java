package methods;

import java.util.Scanner;

public class primenumber {
	
	int count;
	int a;
	
	
	void info()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check for prime number or not");
		a=sc.nextInt();
	}
	
	void display()
	{
		count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
	}


}
