package example;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // palindrome in integers
		System.out.println("hello");
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
	}
	

}
