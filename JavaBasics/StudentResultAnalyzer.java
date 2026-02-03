package JavaBasics;
import java.util.Scanner;

public class StudentResultAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name here: ");
        String name = scanner.nextLine();
        System.out.println("How many subjects(1-6)? ");
        int noOfSubjects = scanner.nextInt();
        int totalScore = 0;
        double averageScore = (totalScore) / (noOfSubjects);
        int subScore;
        boolean valid = true;
        while (true) {
            for (int i = 1; i <= noOfSubjects; i++) {
                subScore = scanner.nextInt();
                scanner.nextLine();
                if (subScore < 0 || subScore > 100) {
                    System.out.println("Invalid score!");
                    System.out.println("Re-enter score: ");
                    subScore = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    totalScore += subScore;
                }
            }    
        System.out.println("Total score: " + totalScore);
        }
    }    
}