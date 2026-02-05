package JavaBasics;
import java.util.Scanner;

public class StudentResultAnalyzer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Get student name
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        // Step 2: Get number of subjects
        System.out.print("Enter number of subjects (1 - 6): ");
        int subjects = input.nextInt();

        // Step 3: Prepare total score
        int totalScore = 0;

        // Step 4: Loop to enter scores
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter score for subject " + i + ": ");
            int score = input.nextInt();

            // Validate score
            while (score < 0 || score > 100) {
                System.out.print("Invalid score. Enter again (0 - 100): ");
                score = input.nextInt();
            }

            totalScore = totalScore + score;
        }

        // Step 5: Calculate average
        double average = (double) totalScore / subjects;

        // Step 6: Determine grade
        char grade;
        if (average >= 80) {
            grade = 'A';
        } else if (average >= 70) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Step 7: Display results
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Total Score: " + totalScore);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("Grade: " + grade);

        input.close();
    }
}
