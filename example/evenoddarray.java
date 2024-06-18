package example;

import java.util.Scanner;

public class evenoddarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = new int[10];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
		System.out.println("Enter a number to store in Array");
		 a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++)
		{
			if(a[j]%2==0) {
				System.out.println("Even number"+a[j]);
			}
			else {
				System.out.println("Odd number"+a[j]);
			}
		}
	}

}
