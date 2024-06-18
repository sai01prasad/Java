package methods;

public class private_Method {
	
	private int id;
	private String name;
	

	int getId() {
		return id;
	}


	void setId(int id) {
		this.id = id;
	}


	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}


	public static void main(String[] args) {
		
		private_Method ob = new private_Method();
	
		ob.setId(101);
		System.out.println(ob.getId());
		ob.setName("jfnsdjgj");
		System.out.println(ob.getName());
		ob.display();
		

	}

}
