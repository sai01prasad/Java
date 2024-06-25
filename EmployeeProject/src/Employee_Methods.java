import java.util.HashSet;
import java.util.Scanner;

public class Employee_Methods {
		
	HashSet <Employee> hs = new HashSet<Employee>();
	
	Employee_Methods()
	{
		hs.add(new Employee(101,"s"));
		hs.add(new Employee(102,"sa"));
		hs.add(new Employee(103,"sas"));
		hs.add(new Employee(104,"sasa"));
		hs.add(new Employee(105,"sasas"));
	}
	
	void displayemp()
	{
		System.out.println(hs);
	}
	
	void viewemp()
	{
		for(Employee x:hs)
		{
			System.out.println(x);
		}
	}
	
	void SearchEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Search Id");
		int s_id = sc.nextInt();
		boolean flag=false;
		Employee so = null;
		for(Employee x:hs)
		{
			if(s_id==x.id)
			{
				flag=true;
				so=x;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Employee with given Id is Present"+so);
			
		}
		else {
			System.out.println("Employee with given Id is not Present");
		}
		
		
	}
	
	void DeleteEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Id to delete Employee");
		int d_id = sc.nextInt();
		boolean flag=false;
		Employee od = null;
		for(Employee x:hs)
		{
			if(d_id==x.id)
			{
				flag=true;
				 od=x;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Employee is Present and it is Deleted"+ hs.remove(od));
			System.out.println("Employee set updated"+" "+hs);
		}
		else
		{
			System.out.println("Employee Id is not present");
		}
		
	}
	
	void UpdateEmployee()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Employe Id to Update Employee Name");
		int u_id = sc.nextInt();
		String uname;
		boolean flag=false;
		Employee uo=null;
		for(Employee x:hs)
		{
			if(u_id==x.id)
			{
				flag=true;
				uo=x;
				break;
				
			}
		}
		if(flag)
		{
			System.out.println("Employee Id is present"+hs.remove(uo));
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter new name for Employee");
			uname=sc1.nextLine();
			hs.add(new Employee(u_id,uname));
			System.out.println("updated Employee Set"+hs);
			
		}
		
		
	}
	
}
