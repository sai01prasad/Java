package student;

public class Student_controller 
{

	private Student model;
	private Student_view view;
	
	public Student_controller(Student model, Student_view view) 
	{
		//super();
		this.model = model;
		this.view = view;
	}

	public int getstudent_id() {
		return model.getStudent_id();
	}

	public void setStudent_id(int student_id) {
		model.setStudent_id(student_id);
	}

	public String getstudent_name()
	{
		return model.getStudent_name();
	}
	
	public void setstudent_name(String student_name)
	{
		model.setStudent_name(student_name);
	}
	
	public String getstudent_dept()
	{
		return model.getStudent_dept();
	}
	
	public void setstudent_dept(String student_dept)
	{
		model.setStudent_dept(student_dept);
	}
	
	public void updateview()
	{
		view.printStudentDetails(model.getStudent_id(), model.getStudent_name(), model.getStudent_dept());
	}
	
	
	
	
	
}
