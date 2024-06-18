package methods;

public class constructor_Overloading {
	
	int id;
	String name;
	String city;
	
	constructor_Overloading(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	constructor_Overloading(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+city);
	}

}
