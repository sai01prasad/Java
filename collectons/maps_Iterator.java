package maps;

import java.util.HashMap;
import java.util.Map;

public class maps_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(1, "abc");
		m.put(3, "s0");
		m.put(2, "sss");
		m.put(5, "fhglksg");
		m.put(4, "fgsjg");
		System.out.println("HashMap" +" "+m);
		
		for(Map.Entry<Integer, String> x:m.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
	}

}
