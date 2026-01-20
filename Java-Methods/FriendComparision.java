import java.util.Scanner;

class FriendsComparison {

    // Method to find youngest friend
    public static String findYoungest(int[] age, String[] names) {
        int minIndex = 0;

        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[minIndex]) {
                minIndex = i;
            }
        }
        return names[minIndex];
    }

    // Method to find tallest friend
    public static String findTallest(double[] height, String[] names) {
        int maxIndex = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[maxIndex]) {
                maxIndex = i;
            }
        }
        return names[maxIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = { "Amar", "Akbar", "Anthony" };
        int[] age = new int[3];
        double[] height = new double[3];

        // Input ages
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i]);
            age[i] = sc.nextInt();
        }

        // Input heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter height of " + names[i]);
            height[i] = sc.nextDouble();
        }

        String youngest = findYoungest(age, names);
        String tallest = findTallest(height, names);

        System.out.println("The youngest friend is " + youngest);
        System.out.println("The tallest friend is " + tallest);
    }
}
