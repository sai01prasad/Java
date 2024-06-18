package example;

public class twodimensionalarray {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{11,12,13},{14,15,16},{17,18,19}};
		
		int sum=0;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		
		//printing elements in the 2d array
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		//sum of elements in the 2d array
		
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				sum +=a[i][j];
			}
			
		}
		System.out.println(sum);
		
		//sum of diagonal elements in the 2d array
		
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if(i==j) {
				sum1 +=a[i][j];
				}
			}
			
		}
		System.out.println(sum1);
		
		//sum of each row elements in the 2d array
		
				for(int i=0;i<a.length;i++)
				{
					for (int j=0;j<a.length;j++)
					{
						sum2 +=a[i][j];
					}
					System.out.println(sum2);
					sum2=0;
				}
				
				//sum of each column elements in the 2d array
				
				for(int i=0;i<a.length;i++)
				{
					for (int j=0;j<a.length;j++)
					{
						sum3 +=a[j][i];
					}
					System.out.println(sum3);
					sum3=0;
				}		
				

	}

}
