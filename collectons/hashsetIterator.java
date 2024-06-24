package collectons;

import java.util.*;

public class hashsetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new  HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		
		Iterator<Integer> i = hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		HashSet<String>  hs1 = new  HashSet<String>();
		hs1.add("a");
		hs1.add("b");
		hs1.add("c");
		hs1.add("d");
		hs1.add("e");
		hs1.add("f");
		
		Iterator<String> i1 = hs1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
		

	}

}
