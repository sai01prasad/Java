package example;

import java.util.Arrays;
import java.util.Scanner;

public class missingnumbwtwoelementsarray {
	public static void main (String[]args)
	{
		int a[] = new int[5];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter a number to store in Array");
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		int num=0;
		for(int j=0;j<a.length-1;j++)
		{
			num = a[j];
			num++;
			while( num<a[j+1] )
			{
				
				System.out.print(num+",");
				num++;
			}
			System.out.println();
			
		}
		
	}
}
