package bubblesort;

public class bubbleSort {
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] arr= {22,34,13,67,54,23,11};
  System.out.println("======BUBBLE SORT=========");
  System.out.println("Before sorting:");
  for(int num:arr) {
  	System.out.print(num+" ");
  }
  
  bubbleSort.sort(arr);
  
  System.out.println(); 
  System.out.println("After  sorting:");
  for(int num:arr) {
  	System.out.print(num+" ");
  }
	}
 
	 

}
/*
output
======BUBBLE SORT=========
Before sorting:
22 34 13 67 54 23 11 
After  sorting:
11 13 22 23 34 54 67 
*/