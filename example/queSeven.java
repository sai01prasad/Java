package example;

import java.util.Scanner;

public class queSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter an Arthmetic operator");
		char c = sc.next().charAt(0);
		
		switch(c)
		{
		case '+':
		{
			System.out.println(a+b);
			break;
		}
		case '-':
		{
			System.out.println(a-b);
			break;
		}
		case '*':
		{
			System.out.println(a*b);
			break;
		}
		case '/':
		{
			System.out.println(a/b);
			break;
		}
		default:
		{
			System.out.println("Enter a valied Arthmetic operator");
			break;
		}
		}
	}

}
