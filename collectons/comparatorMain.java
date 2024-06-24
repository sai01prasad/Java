package collectons;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

public class comparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add(new student00(101,15,"sap"));
		al.add(new student00(105,16,"sss"));
		al.add(new student00(99,14,"sfdf"));
		
		//Age Comparator
		Collections.sort(al, new AgeComparator());
		
		java.util.Iterator i= al.iterator();  
		while(i.hasNext())
		{  
		student00 st=(student00)i.next();  
		System.out.println(st.rolno+" "+st.name+" "+st.age);  
		}
		
		//rolno Comparator
		Collections.sort(al, new rolnoComparator());
		
		java.util.Iterator i1= al.iterator();  
		while(i1.hasNext())
		{  
		student00 st=(student00)i1.next();  
		System.out.println(st.rolno+" "+st.name+" "+st.age);  
		}
		
		//name comparator
		Collections.sort(al, new AgeComparator());
		
		java.util.Iterator i2= al.iterator();  
		while(i.hasNext())
		{  
		student00 st=(student00)i2.next();  
		System.out.println(st.rolno+" "+st.name+" "+st.age);  
		}

	}

}
