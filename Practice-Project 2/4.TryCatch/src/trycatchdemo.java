
public class trycatchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		     System.out.println("Something went wrong.");// give some msg to exception
		    	System.out.println(e);  // this show original exception error.
		    }
	}
}

/*

Output
Something went wrong.
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
 */
