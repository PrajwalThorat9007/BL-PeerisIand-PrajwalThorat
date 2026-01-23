import java.util.Scanner;

class IllegalArgumentExceptionDemo {

    // Method 1: Generate IllegalArgumentException
    public static void generateException(String text) {
        // Start index greater than end index
        System.out.println(text.substring(5, 2));
    }

    // Method 2: Handle IllegalArgumentException and generic RuntimeException
    public static void handleException(String text) {
        try {
            // Start index greater than end index
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled!");
            System.out.println("Reason: Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled!");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Step 1: Calling method that generates exception
        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main method.");
        }

        // Step 2: Calling method that handles exception internally
        System.out.println("\nHandling IllegalArgumentException:");
        handleException(input);

        sc.close();
    }
}

