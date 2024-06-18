package example;

public class eosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int esum=0,osum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				esum=esum+i;
			}
			else
			{
				osum=osum+i;
			}
		}
		System.out.println("Even-Sum and Odd-Sum is : "+esum+" "+"&"+" "+osum);
	}

}
