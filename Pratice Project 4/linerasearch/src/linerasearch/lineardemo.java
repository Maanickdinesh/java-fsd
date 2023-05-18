package linerasearch;

import java.util.*;

public class lineardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 3, 1, 4, 99, 11, 23, 45, 66, 8 };// unsorted
		Arrays.sort(a);
		for (int display : a) {
			System.out.print(display + ",");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the element to search");
		int key = sc.nextInt();
		int flag = 0;
		int i=0;
		for ( i = 0; i < a.length; i++) {
			if (a[i] == key) {
				flag = 1;
				break;
			} else {
				flag = 0;
			}
		}
		if (flag == 1) {
			System.out.println("\nThe element found at the location " + i);
		} else {
			System.out.println("Element is not found");
		}
	}

}
