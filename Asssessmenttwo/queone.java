package Asssessmenttwo;

class Airplane
{
	int fno;
	String des;
	double dt;
	double delayt;
	
	void status()
	{
		if(dt>=(dt+delayt))
		{
			System.out.println("Flight is not Delayed");
		}
		else
		{
			System.out.println("Flight is  Delayed"+" "+delayt+" "+"hours");
		}
	}
}

public class queone {

}
