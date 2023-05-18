import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 3, 1, 4, 99, 11, 23, 45, 66, 8 };
		Arrays.sort(a);
		System.out.println("The Sorted array is");
		for (int i : a) {
			System.out.print(i);
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search");
		int key = sc.nextInt();
		int low = 0;
		int high = a.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] == key) {
				System.out.println("element is found at the location " + (mid + 1));
				break;
			} else if (a[mid] < key) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}

		}
	}
}
