package Employee_Map;

import java.util.*;

public class Employee_Services {
	
	HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
	
	Employee_Services()
	{
		hm.put(1, new Employee(101,"abc",30000));
		hm.put(2, new Employee(102,"abcd",40000));
		hm.put(3, new Employee(103,"abcde",50000));
		hm.put(4, new Employee(104,"abcdef",60000));
		hm.put(5, new Employee(105,"ab",70000));
		
	}
	void display()
	{
		for(Map.Entry<Integer, Employee> x:hm.entrySet())
		{
		System.out.println(x.getKey()+" "+x.getValue());
		}
	}
	void view()
	{
		System.out.println(hm);
	}
	
	void SearchEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Search key");
		int s_id = sc.nextInt();
		boolean flag=false;
		Employee so = null;
		for(Map.Entry<Integer, Employee> x:hm.entrySet())
		{
			if(s_id==x.getKey())
			{
				flag=true;
				so=x.getValue();
				break;
			}
		}
		if(flag)
		{
			System.out.println("Employee with given key is Present"+" "+s_id+" "+"="+" "+so);
			
		}
		else {
			System.out.println("Employee with given key is not Present");
		}
		
		
	}
	
	void DeleteEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee key to delete Employee");
		int d_id = sc.nextInt();
		boolean flag=false;
		Employee od = null;
		for(Map.Entry<Integer, Employee> x:hm.entrySet())
		{
			if(d_id==x.getKey())
			{
				flag=true;
				 od=x.getValue();
				break;
			}
		}
		if(flag)
		{
			System.out.println("Employee is Present and it is Deleted"+" "+ hm.remove(d_id));
			System.out.println("Employee Map updated"+" "+hm);
		}
		else
		{
			System.out.println("Employee key is not present");
		}
		
	}
	
	void UpdateEmployee()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Employe key to Update Employee Name");
		int u_id = sc.nextInt();
		int uid,usal;
		String uname;
		boolean flag=false;
		Employee uo=null;
		for(Map.Entry<Integer, Employee> x:hm.entrySet())
		{
			if(u_id==x.getKey())
			{
				flag=true;
				uo=x.getValue();
				break;
				
			}
		}
		if(flag)
		{
			System.out.println("Employee key is present");
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter new Employee_Id for Employee");
			uid=sc3.nextInt();
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter new Employee_name for Employee");
			uname=sc1.nextLine();
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter new Employee_Salary for Employee");
			usal=sc2.nextInt();
			hm.replace(u_id, new Employee(uid,uname,usal));
			System.out.println("Employee details Updated Successfully");
			System.out.println("updated Employee Map"+hm);
			
		}
		else
		{
			System.out.println("Employee key is not present");
		}
		
		
	}
	

}
