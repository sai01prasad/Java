package collectons;

public abstract class student {
	
	int id;
	String name;
	void display() {
		System.out.println(id+" "+name);
		
	}
	student(int id,String name)
	{
		this.id = id;
		this.name = name;
		
	}
	public abstract void marks();

}
