package methods;

public class ToStringMethod {

		
	    static class Temp{
	        private int a, b;

	        public Temp(int a, int b) {
	            this.a = a;
	            this.b = b;
	        }

	        @Override
	        public String toString() {
	            return "Temp{" +
	                    "a=" + a +
	                    ", b=" + b +
	                    '}';
	        }
	    }

	    public static void main(String[] args) {
	        Temp ob = new Temp(2,3);
	       
	        System.out.println(ob);


	}

}
