public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }
        
    }
    
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not possible!");
        }
        return a / b;
    }
}
/*
 * Output 
 * Exception caught: Division by zero is not possible!
 */