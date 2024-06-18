
public class que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "this is java";
		String s2="java";
		String s3[] = s1.split(" ");
		int flag = 0;
		for(String x:s3)
		{
			if(x.equals(s2))
			{
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("true");
		}

	}

}
