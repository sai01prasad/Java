package maps;

import java.util.*;

public class maps_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(1, "abc");
		m.put(3, "s0");
		m.put(2, "sss");
		m.put(5, "fhglksg");
		m.put(4, "fgsjg");
		System.out.println("HashMap" +" "+m);
		
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(6, "abc");
		m1.put(7, "s0");
		m1.put(8, "sss");
		System.out.println(m1);
		
		System.out.println( m.containsKey(5));
		
		//m.clear();
		System.out.println(m);
		
		System.out.println( m.containsValue("s0"));
		
		System.out.println( m.get(1));
		
		System.out.println( m.isEmpty());
		
		System.out.println( m.hashCode());
		
		m.putAll(m1);
		System.out.println(m);
		
		m.remove(8);
		System.out.println(m);
		
		m.remove(7, "s0");
		System.out.println(m);
		
		m.replace(6, "sgdgfdbfshhr");
		System.out.println(m);
		
		

	}

}
