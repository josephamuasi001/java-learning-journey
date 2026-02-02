package JavaBasics;
import java.util.Scanner;

public class MiniProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String continueProgram = "yes";

        while (continueProgram.equalsIgnoreCase("yes")) {
            System.out.println("Enter your name here: ");
            String name = scanner.nextLine();
            System.out.println("Enter your a score here: ");
            int score = scanner.nextInt();
            scanner.nextLine();

            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 50) {
                System.out.println("Average");
            } else {
                System.out.println("Fail");
            }
            
            System.out.println("Do you want to continue? (yes/no) ");
            continueProgram = scanner.nextLine();
        }
        scanner.close();
    }
}
