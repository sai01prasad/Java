package methods;

import java.util.Scanner;

public class vowelsandconsonants {
	
char num;
	
	void info() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character :");
	 num=sc.next().charAt(0);
	 
	}
	
	void display()
	{
		
		if(num == 'a'|num=='e'|num=='i'|num =='o'|num=='u')
	
	{
		System.out.println("Vowels");
	}
	else
	{
		System.out.println("Consonants");
	}
	}

}
