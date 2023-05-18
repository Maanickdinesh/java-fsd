
public class selectionSort {

	public static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) { // position fix
			int Index = i;
			for (int j = i + 1; j < arr.length; j++) // select min value
			{
				if (arr[j] < arr[Index]) {
					Index = j;
				}
			}
			// swap i,minindex
			int temp = arr[i];
			arr[i] = arr[Index];
			arr[Index] = temp;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 14, 43, 11, 58, 22, 1, 8 };
		System.out.println("======SELECTION SORT=======");
		System.out.println("Before sorting:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		selectionSort.sort(arr);

		System.out.println();
		System.out.println("After  sorting:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}

/*
output
======SELECTION SORT=======
Before sorting:
9 14 43 11 58 22 1 8 
After  sorting:
1 8 9 11 14 22 43 58 

*/