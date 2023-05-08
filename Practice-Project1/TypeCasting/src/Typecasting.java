
public class Typecasting {

	public static void main(String[] args) {
		
		
		//1.implicit or widening conversion -> small to large
		//byte->shot->int->long->float->double
		
		int i=10;
		double j =i;
		System.out.println("implicit type casting is "+ j);
		
		//2.Explict or narrowing type casting -> large to small
		//double->float->long->int->shot->byte
		double x = 10.6; 
		int y = (int)x;
		System.out.println("Explicit type casting is "+y);
	}

}
