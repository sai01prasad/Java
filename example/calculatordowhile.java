package example;

import java.util.Scanner;

public class calculatordowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char ch;
		do
		{
			System.out.println("Enter a number1 to perform a arthmetic operation");
			int a=sc.nextInt();
			System.out.println("Enter a number2 to perform a arthmetic operation");
			int b=sc.nextInt();
			System.out.println("Enter your choice");
			char num=sc.next().charAt(0);
			switch(num)
			{
			case '+': System.out.println("Addition = "+(a+b));
					break;
			case '-': System.out.println("Subtraction = "+(a-b));
					break;
			case '*': System.out.println("Multiplication = "+(a*b));
					break;
			case '/': System.out.println("division = "+(a/b));
					break;
			case '%': System.out.println("Modulous = "+(a%b));
					break;
					
			}
			System.out.println("Enter y to continue and n to exit");
			ch = sc.next().charAt(0);
			if(ch=='n')
			{
				break;
			}
		}
		while(ch=='y');
		
	}

}
