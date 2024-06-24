package collectons;

import java.util.*;

class student00
{
	int rolno;
	int age;
	String name;
	
	student00(int rolno,int age,String name)
	{
		this.age = age;
		this.rolno = rolno;
		this.name = name;
	}
}

class AgeComparator implements Comparator
{
	

	@Override
	public int compare(Object o1, Object o2) {
		student00 s1 = (student00)o1;
		student00 s2 = (student00)o2;
		if(s1.age==s2.age)
		return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return-1;
	}

	
}

class rolnoComparator implements Comparator
{
	

	@Override
	public int compare(Object o1, Object o2) {
		student00 s1 = (student00)o1;
		student00 s2 = (student00)o2;
		if(s1.rolno==s2.rolno)
		return 0;
		else if(s1.rolno>s2.rolno)
			return 1;
		else
			return-1;
	}

	
}

class NameComparator implements Comparator
{  
	public int compare(Object o1,Object o2)
	{  
		student00 s1=(student00)o1;  
		student00 s2=(student00)o2;  
  
	return s1.name.compareTo(s2.name);  
	}  
}  

public class comparator {

}
