package innerclass;

public class innerclass {
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println("Inner class");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerclass obj = new innerclass();
		innerclass.Inner in1 = obj.new Inner();
		in1.msg();
	}
	

}
/*
 output
 Inner class

 */
