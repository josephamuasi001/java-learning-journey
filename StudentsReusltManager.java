import java.util.Scanner;

public class StudentsReusltManager {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean keepRunning = true;  
    String studentName;
    int studentScore;

        while (keepRunning) {
            //Asking for student name
            System.out.println("Enter your name here: ");
            studentName = scanner.nextLine();

            //Asking for student score
            System.out.println("Enter your score here(0-100): ");
            studentScore = scanner.nextInt();
            scanner.nextLine();

            
        }

    }
}
