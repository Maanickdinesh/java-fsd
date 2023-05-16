
import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the range (L and R): ");
        int L = scanner.nextInt();
        int R = scanner.nextInt();

        int sum = findSumInRange(array, L, R);
        System.out.println("Sum of elements in the range of L and R: " + sum);
    }

    public static int findSumInRange(int[] array, int L, int R) {
        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += array[i];
        }
        return sum;
    }
}

/*
output

Enter the number of elements (n): 6
Enter the elements:
3 4 5 6 7 8 
Enter the range (L and R): 0 3
Sum of elements in the range of L and R: 18
*/