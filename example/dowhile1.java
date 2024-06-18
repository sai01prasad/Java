package example;

import java.util.Scanner;

public class dowhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char ch;
		
		do
		{
			System.out.println("Enter your choice from 1 to 3");
			int n = sc.nextInt();
			switch(n)
			{
			case 1:
			{
				System.out.println("Enter a number to check Armstrong Number");
				int num = sc.nextInt();	
				int temp = num;
				int rev = 0;
				int count = 0;
				while(temp>0)
				{
					temp = temp/10;
					count++;
				}
				System.out.println(count);
				temp=num;
				while (temp>0)
				{
					int d = temp%10;
					rev = (int) (rev+Math.pow(d,count));
					temp = temp/10;
				}
				if(rev==num)
				{
					System.out.println("Armstrong Number");
				}
				else
				{
					System.out.println("Not a Armstrong Number");
					
				}
				break;
			}
			case 2:
			{
				int num = 11511;
				int temp = num;
				int rev = 0;
				while (temp !=0)
				{
					int d = temp%10;
					rev = rev*10+d;
					temp = temp/10;
				}
				if(rev==num)
				{
					System.out.println("palindrome");
				}
				else
				{
					System.out.println("Not a Palindrome");
					
				}
				break;
			}
			case 3:
			{
				for(int i=1;i<=4;i++)
				{
					for(int j=1;j<=4;j++)
					{
						if((i==2&j==3)|(i==3&j==2)|(i==4&j==2)|(i==4&j==3))
						{
							
							System.out.print(" ");
							continue;
							
						}
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			}
			}
			System.out.println("Enter y to continue and a to exit ");
			 ch = sc.next().charAt(0);
			if(ch=='a')
			{
				break;
			}
		}
		
		while(ch=='y');
		
	}

}
