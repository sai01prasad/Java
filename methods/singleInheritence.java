package methods;

class vehicle
{
	void display()
	{
		System.out.println("I am A Vehicle");
		
	}
}

class twoWheeler extends vehicle
{
	void show()
	{
		System.out.println("I am A two wheeler");
	}
}

public class singleInheritence {
	
	public static void main (String[]args)
	{
		twoWheeler ob = new twoWheeler();
				ob.display();
				ob.show();
	}
	
}
