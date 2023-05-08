package protecpack2;
import protectpack1.*;
public class protecaccess extends protecaccess1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protecaccess obj = new protecaccess();
		obj.show();
		System.out.println("This is procteced access we can not access outside the package so we can use extends\n"
				+ "keyword you can access the proteced access specifier");
	}

}
