package collections.setInterface;

import java.util.*;
import java.util.TreeSet;

class Book1 implements Comparable<Book1>
{    
int id;    
String name,author;    
   
public Book1(int id, String name, String author) 
{    
    this.id = id;    
    this.name = name;    
    this.author = author;    
       
}    
 
public int compareTo(Book1 b) 
{    
    if(id>b.id)
    {    
        return 1;    
    }
    else if(id<b.id)
    {    
        return -1;    
    }
    else
    {    
    return 0;    
    }    
}    
}    

public class TreeSetExample {

	public static void main(String[] args) {
		
		
		 Set<Book1> set=new TreeSet<Book1>();    
		       
		    Book1 b1=new Book1(121,"Let us C","Yashwant Kanetkar");    
		    Book1 b2=new Book1(233,"Operating System","Galvin");    
		    Book1 b3=new Book1(101,"Data Communications & Networking","Forouzan");    
		      
		    set.add(b1);    
		    set.add(b2);    
		    set.add(b3);    
		     
		    for(Book1 b:set)
		    {    
		    System.out.println(b.id+" "+b.name+" "+b.author);    
		    }    

	}

}
