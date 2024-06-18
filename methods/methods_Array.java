package methods;

import java.util.Scanner;

public class methods_Array {
	
	int id;
	String name;
	
	void info()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Id and name ");
	id= sc.nextInt();
	
	name = sc.next();
	
	}
	
	void display()
	{
		System.out.println("Your id and name are : "+id+" "+name);
	}
	

}
