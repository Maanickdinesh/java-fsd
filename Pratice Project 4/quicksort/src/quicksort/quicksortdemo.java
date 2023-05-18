package quicksort;

import java.util.*;

public class quicksortdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 6, 3, 5, 4, 8, 9, 11 };
		//Arrays.sort(arr);
		quicksort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	static void quicksort(int arr[], int low, int high) {
          if(low>=high)
        	  return;
          int start = low;
          int end = high;
          int mid = (start+end)/2;
          int pivot = arr[mid];
          
          while (start<=end) {
        	  while(arr[start]<pivot)
        		  start++;
        	  while(arr[end]>pivot)
        		  end--;
        	  if(start<=end) {
        		  int temp = arr[start];
        		  arr[start] = arr[end];
        		  arr[end] = temp;
        		  start++;
        		  end--;
        	  }
        	  
        	  
          }
          
          
         quicksort(arr,low,end);
         quicksort(arr,start,high);
	}

}
