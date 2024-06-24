package collections.setInterface;

import java.util.LinkedHashSet;

public class linkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet();
		lhs.add("abc");
		lhs.add("def");
		lhs.add("ghi");
		lhs.add("jkl");
		System.out.println(lhs);
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet();
		lhs1.add("abc");
		lhs1.add("def");
		
		lhs.remove("abc");
		System.out.println(lhs);
		
		//lhs.clear();
		//System.out.println(lhs);
		
		System.out.println( lhs.isEmpty());
		System.out.println( lhs.size());
		System.out.println(lhs.contains("jkl"));
		System.out.println(lhs.containsAll(lhs1));

	}

}
