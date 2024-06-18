package example;

import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
		System.out.println("Enter a number to store in Array");
		 a[i]=sc.nextInt();
		}
		System.out.println("elements in the array");
		for (int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}

}
