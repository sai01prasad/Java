package Asssessmenttwo;

class Employee
{
	String name;
	String jt;
	int sal;
	
	void sumsal(int sal)
	{
		this.sal = sal;
		System.out.println(name+"'s one year salary is"+" "+(sal*12));
	}
	void salup(int sal)
	{
		this.sal = sal;
		System.out.println(name+"'s new updated salary is"+" "+(sal+10000));
		
	}
}


public class quetwo {

}
