import java.util.Scanner;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_Methods ob = new Employee_Methods();
		//ob.displayemp();
		//ob.viewemp();
		//ob.SearchEmployee();
		//ob.DeleteEmployee();
		//ob.UpdateEmployee();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1-to view Employee set \n 2-view Employee id and Name \n 3- to Search Employees \n 4- to remove Employee \n 5- to Update Employee");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: ob.displayemp();
				break;
		case 2: ob.viewemp();
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
	}

}
