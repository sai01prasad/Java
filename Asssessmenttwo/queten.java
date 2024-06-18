package Asssessmenttwo;

class Employee2{
	
	void work()
	{
		System.out.println("Employee work");
		
	}
	void getSalary()
	{
		System.out.println("Employee Salary is 100000");
	}
}

class HRManager extends Employee2
{
	
	void work()
	{
		System.out.println("HR Manager work");
	}
	void addEmployee()
	{
		System.out.println("New employee is added");
	}
}

public class queten {

}
