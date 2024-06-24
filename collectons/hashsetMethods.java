package collectons;

import java.util.ArrayList;
import java.util.HashSet;

public class hashsetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new  HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		System.out.println(hs);
		
		HashSet  hs1 = new  HashSet();
		hs1.add("a");
		hs1.add("b");
		hs1.add("c");
		hs1.add("d");
		hs1.add("e");
		hs1.add("f");
		System.out.println(hs1);
		
		//removing elements
		
		System.out.println("after removing elements from set");
		
		hs.remove(2);
		hs.remove(5);
		System.out.println(hs);
		
		hs1.remove("b");
		hs1.remove("d");
		System.out.println(hs1);
		
		//size()
		System.out.println("using size()");
		System.out.println("size of HashSet"+" "+hs.size());
		System.out.println("size of HashSet"+" "+hs1.size());
		
		//clear method
	/*	System.out.println("after using clear method");
		hs.clear();
		System.out.println(hs);   */
		
		
		System.out.println("after using the isEmpty()");
		System.out.println( hs.isEmpty());

		//adding two sets
		hs.addAll(hs1);
		System.out.println(hs);
		
		
		//converting ArrayList to Hashset
		System.out.println("converting ArrayList to Hashset");
		
		ArrayList a= new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(3);
		a.add(2);
		System.out.println("ArrayList"+" "+a);
		
		HashSet hs2 = new HashSet(a);
		System.out.println("Hashset"+" "+hs2);
		
		
		//contains and contains all methods
		System.out.println(hs.contains(3));
		System.out.println(hs.containsAll(hs1));
		
		
		
	}

}
