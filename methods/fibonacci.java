package methods;

public class fibonacci {
	
int n1,n2,n3,i,count; 
	
	void display()
	{
		n1=0;
		n2=1;
	
		System.out.print(n1+" "+n2);
		for(i=2;i<count;++i)   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }
	}
	
}
