package methods;

public class constructor_Chaining {
	
	int id;
	String name;
	String city;
	
	constructor_Chaining(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	constructor_Chaining(int id,String name,String city)
	{
		this (id, name);
		this.city=city;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+city);
	}

}
