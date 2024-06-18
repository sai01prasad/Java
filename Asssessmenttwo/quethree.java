package Asssessmenttwo;

class Employee3
{
	String name;
	int sal;
	int jday,jmonth,jyear;
	int pday,pmonth,pyear;
	
	void yoe()
	{
		System.out.println("Years of experience"+(pyear-jyear));
	}
	
}

class temployee extends Employee3
{
	temployee(int jyear, int pyear)
	{
		this.jyear=jyear;
		this.pyear=pyear;
		yoe();
	}
}
class pemployee extends Employee3
{
	pemployee(int jyear, int pyear)
	{
		this.jyear=jyear;
		this.pyear=pyear;
		yoe();
	}
}

public class quethree {

}
