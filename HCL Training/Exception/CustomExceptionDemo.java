package Exception;

public class CustomExceptionDemo {

    public static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older to register.");
        }
        System.out.println("Valid age. Access granted!");
    }

    public static void main(String[] args) {
        try {
            validateAge(15); // Triggers the custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}