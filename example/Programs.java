package example;

import java.util.Arrays;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Search an Element in an Array
		int a[] = {1,2,4,6,7,8};
		int s1 = 6;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s1)
			{
				System.out.println("Element Found at : "+i);
				break;
			}
			else
			{
				System.out.println("Element not found");
			}
		}
		
		//Find the Largest Element in an Array
		int b[] = {1,2,6,7,4,3};
		int max=b[0];
		for(int i=1;i<b.length;i++)
		{
			if(max<b[i])
			{
				max=b[i];
			}
		}
		System.out.println(max);
		
		
		//Sort an Array
		int c[] = {56,25,77,15,89,10,8};
		int temp=0;
		for(int i=0;i<c.length;i++)
		{	
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					
				}
			}
			System.out.println(c[i]);
		}
		
		
		//Sort the Elements of an Array in Ascending Order
		int d[] = {56,25,77,15,89,10,8};
		Arrays.sort(d);
		for(int x:d)
		{
			System.out.println(x);
		}
		
		
		//Sort the Elements of an Array in Descending Order
		int e[] = {56,25,77,15,89,10,8};
		int temp1=0;
		for(int i=0;i<e.length;i++)
		{	
			for(int j=i+1;j<e.length;j++)
			{
				if(e[i]<e[j])
				{
					temp1=e[i];
					e[i]=e[j];
					e[j]=temp1;
					
				}
			}
			System.out.println(e[i]);
		}
		
		//Remove Duplicate Elements From an Array
		
		int f[] = {15,25,77,15,89,15,8};
		for(int i=0;i<f.length;i++)
		{	
			for(int j=i+1;j<f.length;j++)
			{
				if(f[i]==f[j])
				{
					f[j]=0;
					
				}
			}
			System.out.println(f[i]);
		}
		
		
		
		
	}

}
