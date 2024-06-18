package example;

import java.util.Scanner;

public class vowelsandconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print it's table");
		char num=sc.next().charAt(0);
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
