import java.util.Scanner;

public class que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your average");
		int avg = sc.nextInt();
		
		if(avg==80)
		{
			System.out.println("A grade");
		}
		else if(avg<80 && avg>=60)
		{
			System.out.println("B grade");
		}
		else if(avg == 40)
		{
			System.out.println("C grade");
		}
		else
		{
			System.out.println("D grade");
		}

	}

}
