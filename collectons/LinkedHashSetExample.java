package collections.setInterface;

import java.util.LinkedHashSet;

class Book
{  
	int id;  
	String name,author;  
  
	public Book(int id, String name, String author) 
	{  
		this.id = id;  
		this.name = name;  
		this.author = author;  
    
	}  
}  

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		
		 LinkedHashSet<Book> hs=new LinkedHashSet<Book>();  
		    
		    Book b1=new Book(101,"Let us C","Yashwant Kanetkar");  
		    Book b2=new Book(102,"Data Communications & Networking","Forouzan");  
		    Book b3=new Book(103,"Operating System","Galvin");  
		     
		    hs.add(b1);  
		    hs.add(b2);  
		    hs.add(b3);  
		    
		    for(Book b:hs)
		    {  
		    System.out.println(b.id+" "+b.name+" "+b.author);  
		    }  

	}

}
