package example;

public class uppertoLowerAndViceversaInaWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "PottiRaJUz";
		int rev;
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char temp= s1.charAt(i);
			if(temp >= 'a' && temp<='z')
			{
				rev= (int) temp-32;
				s2 +=(char)rev;
			}
			else 
			{
				rev= (int) temp+32;
				s2 +=(char)rev;
			}
			
		}
		System.out.println(s2);
		

	}

}
