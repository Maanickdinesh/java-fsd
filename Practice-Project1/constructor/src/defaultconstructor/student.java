package defaultconstructor;


class studentdetails{
	int reg = 344456;;
	String name = "Rocky";
	
	void display() {
		System.out.println("This is default constructor");
		
	}
}

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentdetails obj = new studentdetails();
		obj.display();
		System.out.println("Student id is "+ obj.reg);
		System.out.println("Student name is "+ obj.name);
	}

}

/*
Output
This is default constructor
Student id is 344456
Student name is Rocky
*/