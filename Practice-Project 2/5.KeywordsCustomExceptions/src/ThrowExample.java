public class ThrowExample {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 18) {
                throw new Exception("You must be 18 or older to use this service."); // user throws a new Exception message
            } else {
                System.out.println("You're good to go!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
