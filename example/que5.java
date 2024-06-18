import java.util.Arrays;

public class que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="ramu";
		String s2="umar";
		if(s1.length()==s2.length())
		{
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean c = Arrays.equals(c1, c2);
			if(c==true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("not Anagram");
			}
			
			
		}
		else
		{
			System.out.println("not Anagram");
		}
		

	}

}
