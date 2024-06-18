package example;

public class largestStringInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence ");
		String s1 = sc.next();  */	
		String s1= "I am thee Palkkkkak";
		int max=0;
		int count;
		String a[] = s1.split(" ");
		for(String x:a)
		{
			max = x.length();
			count=0;
			for(int i=0;i<x.length();i++)
			{
				count++;
			}
			if(max<count)
			{
				max=count;
			}
			
		}
		System.out.println(max);
	}
}
