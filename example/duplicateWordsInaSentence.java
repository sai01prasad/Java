package example;

public class duplicateWordsInaSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "I am thee thee Palkkkkak";
		int count;

		String s2[] = s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			count=1;
			for(int j=i+1;j<s2.length;j++)
			{
				
				if(s2[i].equals(s2[j]))
				{
					s2[j]= "0";
					count++;
				}
				
			}
			if(count>1&&s2[i]!="0")
			{
				System.out.println(s2[i]);
			}			
		}
	}
}
