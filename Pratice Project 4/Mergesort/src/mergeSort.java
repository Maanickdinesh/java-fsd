import java.util.Arrays;

public class mergeSort {
	public static int[] sort(int[] arr) {
		if (arr.length == 1)
			return arr;
		int mid = arr.length / 2;
		int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

		return merge(left, right);

	}

	public static int[] merge(int[] first, int[] second) {
		int[] joined = new int[first.length + second.length];
		int i = 0, j = 0, k = 0;

		while (i < first.length && j < second.length) {
			if (first[i] < second[j])
				joined[k++] = first[i++];
			else
				joined[k++] = second[j++];
		}

		while (i < first.length)
			joined[k++] = first[i++];
		while (j < second.length)
			joined[k++] = second[j++];

		return joined;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 4, 7, 1, 6, 10, 2, 8, 4, };
		System.out.println("======MERGE SORT=========");
		System.out.println("Before sorting:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		int[] result = mergeSort.sort(arr);

		System.out.println();
		System.out.println("After  sorting:");
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}

/*
output
======MERGE SORT=========
Before sorting:
9 4 7 1 6 10 2 8 4 
After  sorting:
1 2 4 4 6 7 8 9 10 
*/