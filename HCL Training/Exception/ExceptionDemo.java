package Exception;

import java.io.IOException;

public class ExceptionDemo {

    public static void checkFile() throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try {
            checkFile();
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block 1 executed.\n");
        }

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: Cannot divide by zero");
        } finally {
            System.out.println("Finally block 2 executed.");
        }
    }
}