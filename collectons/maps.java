package maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class maps {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new TreeMap<Integer,String>();
		
		for(int i=0;i<5;i++)
		{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key");
		int a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter value");
		String name = sc1.nextLine();
		m.put(a, name);
		
		}
		
		System.out.println(m);
		
		

	}

}
