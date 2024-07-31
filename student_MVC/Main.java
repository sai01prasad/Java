package student;

public class Main 
{

	private static Student getInfoFromDatabase()
	{
		Student s = new Student();
		s.setStudent_id(11);
		s.setStudent_name("abc");
		s.setStudent_dept("JFS");
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = getInfoFromDatabase();
		Student_view view = new Student_view();
		Student_controller con = new Student_controller(s1,view);
		con.updateview();
		
		con.setStudent_id(101);
		System.out.println();
		System.out.println("After changing id :");
		con.updateview();

	}

}
