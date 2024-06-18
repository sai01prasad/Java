package methods;

public class palindrome {
	
	int num;
	int temp;
	int rev;
	
	void display()
	{
		temp=num;
		rev=0;
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
	}
	
}
