package stack;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Insert elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack elements: " + stack);

        // Remove elements from the stack
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Stack elements after removal: " + stack);

        // Insert another element into the stack
        stack.push(60);
        System.out.println("Stack elements after insertion: " + stack);
    }
}

/*
 Output
Stack elements: [10, 20, 30, 40, 50]
Removed element: 50
Stack elements after removal: [10, 20, 30, 40]
Stack elements after insertion: [10, 20, 30, 40, 60]

 */
