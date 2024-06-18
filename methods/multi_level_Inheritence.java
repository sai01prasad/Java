package methods;

class vehicle1
{
	void display()
	{
		System.out.println("I am A Vehicle");
		
	}
}

class twoWheeler1 extends vehicle1
{
	void show()
	{
		System.out.println("I am A two wheeler");
	}
}

class hero extends twoWheeler1
{
	void show1()
	{
		System.out.println("I am A hero motorcycle");
	}
}

public class multi_level_Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hero ob = new hero();
		ob.show();
		ob.show1();
		ob.display();

	}

}
