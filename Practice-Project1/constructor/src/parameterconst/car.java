package parameterconst;

class cardetails{
	
	int car_id;
	String car_name;
	String car_color;
	cardetails(int id,String name,String color){
		 car_id = id ;
		 car_name = name;
		 car_color = color;
	}
	
	void display() {
		System.out.println("car id is "+ car_id);
		System.out.println("car name is "+ car_name);
		System.out.println("car color is"+ car_color);
	}

}

public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cardetails obj1 = new cardetails(4555,"suzuki","red");
		obj1.display();
	}
}

/*
 * 
Output
car id is 4555
car name is suzuki
car color isred
 */
