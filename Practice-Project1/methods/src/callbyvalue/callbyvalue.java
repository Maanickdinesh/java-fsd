package callbyvalue;

public class callbyvalue {
	public static void change (int a) {
	  a = a+5;  // formal parameter
	 System.out.println("During a "+ a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 10;  // actual parameter 
       System.out.println("Before a "+ a);
       change(a);
       System.out.println("After a is "+ a);
	}

}
/*
Output
Before a 10
During a 15
After a is 10

 */

