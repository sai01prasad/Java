package Employee_Map;

import java.util.Scanner;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_Services ob = new Employee_Services();
		//ob.display();
		//ob.view();
		//ob.SearchEmployee();
		//ob.DeleteEmployee();
		//ob.UpdateEmployee();
		char op;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \n 1 - to view Employee Key, Value pair \n 2 - to view Employee Map \n 3 - to Search Employee \n 4 - to remove Employee \n 5 - to Update Employee Details");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: ob.display();
				break;
		case 2: ob.view();
				break;
		case 3: ob.SearchEmployee();
				break;
		case 4: ob.DeleteEmployee();
				break;
		case 5: ob.UpdateEmployee();
				break;
				
		default:
			System.out.println("Invalid Input");
		}
		System.out.println("Enter y to continue and n to exit");
		 op=sc.next().charAt(0);
		if(op=='n')
		{
			break;
		}
		}
		while(op=='y');
		
	}

}
