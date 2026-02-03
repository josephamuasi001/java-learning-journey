package JavaBasics;
import java.util.Scanner;

public class StudentResultAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name here: ");
        String name = scanner.nextLine();
        System.out.println("How many subjects(1-6)? ");
        int noOfSubjects = scanner.nextInt();

        for (int i = 1; i <= noOfSubjects; i++) {
            System.out.println("Enter " + subName + " score here");
            int subScore = scanner.nextInt();
            
        }
        
    }
}