package example;

import java.util.Scanner;

public class posandnegnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check wheather it is a positive or negative number");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("positive number");
		}
		else {
			System.out.println("Negative number");
		}
	}

}
