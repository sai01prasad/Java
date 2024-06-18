package methods;

import java.util.Scanner;

public class armstrong {
	
	int num;
	int temp;
	int rev ;
	int count;
	
	void info()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Armstrong Number");
		num = sc.nextInt();	
		
	}
	
	void display()
	{
		temp=num;
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
	}
	
}
