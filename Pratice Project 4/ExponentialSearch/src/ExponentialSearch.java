public class ExponentialSearch {
    public static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;
        
        if (arr[0] == target) {
            return 0;
        }
        
        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2;
        }
        
        return binarySearch(arr, i / 2, Math.min(i, n - 1), target);
    }
    
    private static int binarySearch(int[] arr, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target);
            }
            
            return binarySearch(arr, mid + 1, right, target);
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 14;
        
        int result = exponentialSearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
