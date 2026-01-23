class NullPointerExceptionDemo {

    // Method 1: Generate NullPointerException
    public static void generateException() {
        String text = null;   // initialized to null
        // This line will throw NullPointerException
        System.out.println(text.length());
    }

    // Method 2: Handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;   // initialized to null

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled!");
            System.out.println("Reason: Attempted to access a method on a null object.");
        }
    }

    public static void main(String[] args) {

        // Step 1: Calling method that generates exception
        System.out.println("Generating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main method.");
        }

        // Step 2: Calling method that handles exception internally
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}
