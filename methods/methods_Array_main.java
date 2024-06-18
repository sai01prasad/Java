package methods;

public class methods_Array_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
methods_Array arr[] = new methods_Array[3];
		
		
		//arr[0] = new methods_Array();
		//arr[0].info();
		//arr[0].display();
		
		
	/*	for(int i=0;i<arr.length;i++)
		{
			arr[i] = new methods_Array();
			arr[i].info();
			arr[i].display();
		}
		*/
		
		
		for(methods_Array x:arr)
		{
			x = new methods_Array();
			x.info();
			x.display();
		}

	}

}
