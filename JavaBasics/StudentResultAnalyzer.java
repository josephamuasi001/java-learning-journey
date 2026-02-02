package JavaBasics;
import java.util.Scanner;
public class StudentResultAnalyzer {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;
    while (running) {
        System.out.println("Enter student name here: ");
        String name = scanner.nextLine();
        
        System.out.println("How many subjects (1-6): ");
        int noOfSubjects = scanner.nextInt();

        for(int i = 1; i <= noOfSubjects; i++ ) {
            System.out.println("Enter " + name + "'s " + i + "score here");
        }

    }


}
