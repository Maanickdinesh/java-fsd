
public class multiarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] b = { { 2, 4, 6, 8 }, { 3, 6, 9 } };

		System.out.println("\nLength of row 1: " + b[0].length); // print length
		System.out.println(b[0][2]); // print specific palce of element
		//
		System.out.println("Using for loop to print arrays");
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println(b[i][j]);
			}
		}
	}

}

/*
Output
Length of row 1: 4
6
Using for loop to print arrays
2
4
6
8
3
6
9
 */
