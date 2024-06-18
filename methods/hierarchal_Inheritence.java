package methods;

class vehicle2
{
	void display()
	{
		System.out.println("I am A Vehicle");
		
	}
}

class twoWheeler2 extends vehicle2
{
	void show()
	{
		System.out.println("I am A two wheeler");
	}
}

class hero1 extends vehicle2
{
	void show1()
	{
		System.out.println("I am A hero motorcycle");
	}
}

public class hierarchal_Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoWheeler2 ob = new twoWheeler2();
		ob.display();
		ob.show();
		hero1 ob1 = new hero1();
		ob1.display();
		ob1.show1();

	}

}
