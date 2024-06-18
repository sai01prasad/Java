package example;

public class removingWordFromSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "I am Potti Raju";
		String del = "Potti";
		String s2[] = s1.split(" ");
		for(String x:s2)
		{
			if(!del.equals(x))
			{
				System.out.print(x+" ");
			}
		}
	}

}
