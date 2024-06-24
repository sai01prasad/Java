package collectons;

class Student1 extends student
{
	Student1(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public void marks() 
	{
		System.out.println("marks of student 1");
	}
}

class Student2 extends student
{
	Student2(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public void marks() 
	{
		System.out.println("marks of student 2");
	}
}


public class studentsMain {

	public static void main(String[] args) {
		
		Student1 ob = new Student1(1,"pooji");
		ob.display();
		ob.marks();
		Student2 ob1 = new Student2(2,"gayi");
		ob1.display();
		ob1.marks();

	}

}
