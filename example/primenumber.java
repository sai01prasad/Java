package example;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for a single number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check for prime number or not");
		int a=sc.nextInt();
		int count=0;
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
		
		
		//prime numbers from 1 to 100
	/*	int i=0;
		int count=0;
		for(int j=1;j<=100;j++)
		{
		for( i=1;i<=j;i++)
		{
			if(j%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(j);
		}
		
		} */
	}

}
