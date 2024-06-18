import java.util.Scanner;

public class que9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight and height");
		float weight=sc.nextFloat();
		float height=sc.nextFloat();
		
		if(height>=5.5 && weight>55)
		{
			System.out.println("Eligible for Physical test");
		}
		else
		{
			System.out.println(" Not Eligible for Physical test");
		}

	}

}
