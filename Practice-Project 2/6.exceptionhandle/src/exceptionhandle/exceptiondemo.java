package exceptionhandle;
import java.util.*;
public class exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      try {
	        System.out.println("Enter the number 1");
	      int n1 = sc.nextInt();
	      System.out.println("Enter the number 2");
	      int n2 = sc.nextInt();
	      int result = n1/n2;
	      System.out.println("Your result is "+result);
	      }
	      catch(InputMismatchException ie) {
	      System.out.println("Please enter only integer");
	      }
	      catch(ArithmeticException ae) {
	          System.out.println("Please check number 2 is zero ");
	          }
	      finally {
	        System.out.println("Code excuted Sucesfully");
	      }
	}

}

/*
 * output 
 * Enter the number 1 
 * 2 
 * Enter the number 2 
 * 0 
 * Please check number 2 is
 * zero Code excuted Sucesfully
 */
