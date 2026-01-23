import java.util.Scanner;

class StringIndexOutOfBoundsExceptionDemo {

    // Method 1: Generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing index beyond string length
        System.out.println(text.charAt(text.length()));
    }

    // Method 2: Handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            // Accessing index beyond string length
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled!");
            System.out.println("Reason: Index accessed is outside the valid range of the string.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Step 1: Calling method that generates exception
        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main method.");
        }

        // Step 2: Calling method that handles exception internally
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(input);

        sc.close();
    }
}
