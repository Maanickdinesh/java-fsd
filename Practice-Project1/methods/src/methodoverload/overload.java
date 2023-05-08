package methodoverload;

public class overload {
	public void add(int a, int b) {
		System.out.println("The addition is "+ (a+b));
	}
	public void add(double a, int b ) {
		System.out.println("The addtion is "+ (a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload obj = new overload();
		obj.add(56.10, 10);
		obj.add(20, 20);
	}

}

// Multiple methods having same name but different parameter.
/*
Output
The addtion is 66.1
The addition is 40

 */
