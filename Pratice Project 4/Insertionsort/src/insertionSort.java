
public class insertionSort {
	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else
					break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 1, 8, 4, 2, 9, 6 };
		System.out.println("=========INSERTION SORT=========");
		System.out.println("Before sorting:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		insertionSort.sort(arr);

		System.out.println();
		System.out.println("After  sorting:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}

/*output
.....INSERTION SORT.....
Before sorting:
5 1 8 4 2 9 6 
After  sorting:
1 2 4 5 6 8 9 
*/
