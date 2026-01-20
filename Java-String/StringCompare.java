import java.util.Scanner;

class StringCompare {

    // Method to compare strings using charAt()
    public static boolean charAtComparision(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        boolean usingCharAt = charAtComparision(str1, str2);
        boolean usingInbuild = str1.equals(str2);

        if (usingCharAt == usingInbuild) {
            System.out.println("Both string comparison results are same");
        } else {
            System.out.println("Both string comparison results are different");
        }
    }
}
