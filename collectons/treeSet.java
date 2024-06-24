package collections.setInterface;

import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> set1=new TreeSet<Integer>();    
        set1.add(24);    
        set1.add(66);    
        set1.add(12);    
        set1.add(15);    
        System.out.println("Lowest Value: "+set1.pollFirst());    
        System.out.println("Highest Value: "+set1.pollLast());
        
        TreeSet<String> set=new TreeSet<String>();  
        set.add("A");  
        set.add("B");  
        set.add("C");  
        set.add("D");  
        set.add("E");  
        System.out.println("Initial Set: "+set);  
          
        System.out.println("Reverse Set: "+set.descendingSet());  
          
        System.out.println("Head Set: "+set.headSet("C", true));  
         
        System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
          
        System.out.println("TailSet: "+set.tailSet("C", false));  
        
        System.out.println();
        
        System.out.println("Intial Set: "+set);  
        
        System.out.println("Head Set: "+set.headSet("C"));  
         
        System.out.println("SubSet: "+set.subSet("A", "E"));  
          
        System.out.println("TailSet: "+set.tailSet("C")); 

	}

}
