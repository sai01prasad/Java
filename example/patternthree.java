package example;

public class patternthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		//23
		//456
		//78910
		//1112131415
		
		int count=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				count++;
				System.out.print(count);
			}
			System.out.println();
		}
	}

}
