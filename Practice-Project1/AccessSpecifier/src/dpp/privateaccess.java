package dpp;
class privateacces{
	private void show() {
		System.out.println("This is Private access specifier");
	}
}
public class privateaccess {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privateaccess obj = new privateaccess();
		System.out.println("You cannot access private in different class");
		//obj.show();
	}

}
