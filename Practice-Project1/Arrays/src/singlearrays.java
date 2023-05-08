
public class singlearrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5]; // array initialization
		a[0]=5;
		a[1]=4;
		a[2]=9;
		a[3]=8;
		a[4]=2;
		System.out.println(a); //print object id
		System.out.println(a[0]); // normal method to print
		//using for loop
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		// using for each loop
		System.out.println("using for each loop");
		for(int i: a) {
			System.out.println(i);
		}
		System.out.println("Second Mehod");
		
		int a1[]= {45,78,32,89};
		for(int i=0;i<a1.length;i++) {
			System.out.print(a[i]);
			
		
		}
 
	}

}

/*
Output
[I@1c4af82c
5
5
4
9
8
2
using for each loop
5
4
9
8
2
Second Mehod
5498
*/