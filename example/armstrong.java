package example;
import java.util.*;

public class armstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
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

	}

}
