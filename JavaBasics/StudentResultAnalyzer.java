package JavaBasics;
import java.util.Scanner;

public class StudentResultAnalyzer {
    public static void main(String[] args) {
        
    
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int noOfSubjects;
        int totalScore = 0;
        int averageScore = (totalScore) / (noOfSubjects);

        while (running) {
            System.out.println("Enter student name here: ");
            String name = scanner.nextLine();
        
            System.out.println("How many subjects (1-6): ");
            noOfSubjects = scanner.nextInt();

            for(int i = 1; i <= noOfSubjects; i++ ) {
                System.out.println("Enter " + name + "'s " + i + "score here (0-100): ");
                int studentScore = scanner.nextInt();
                scanner.nextLine();
                if (studentScore < 0 || studentScore > 100) {
                    System.out.println("Invalid score! ");
                    System.out.println("Re-enter score here: ");
                }

            }

        }

    }
}
