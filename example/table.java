package example;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print it's table");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" "+"*"+" "+i+" "+"="+" "+(num*i));
		}
	}

}
