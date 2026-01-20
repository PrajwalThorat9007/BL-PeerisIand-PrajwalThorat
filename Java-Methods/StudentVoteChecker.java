import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check voting eligibility
    public boolean canStudentVote(int age) {

        // Validate negative age
        if (age < 0) {
            return false;
        }

        // Check voting condition
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];
        StudentVoteChecker obj = new StudentVoteChecker();

        // Take input and check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Enter age of student " + (i + 1));
            ages[i] = sc.nextInt();

            boolean canVote = obj.canStudentVote(ages[i]);

            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote");
            }
        }
    }
}
