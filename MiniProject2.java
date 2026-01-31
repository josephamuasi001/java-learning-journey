import java.util.Scanner;

public class MiniProject2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueProgram = "yes";

        while (continueProgram.equalsIgnoreCase("yes")) {
            System.out.println("Enter your name here: ");
            String name = scanner.nextLine();
            System.out.println("Enter your score here(0-100): ");
            int score = scanner.nextInt();
            scanner.nextLine();

            if (score < 0 || score > 100) {
                System.out.println("Invalid score");
            } else {
                if (score >= 90 && score <= 100) {
                    System.out.println("Excellent");
                } else if (score >= 70) {
                    System.out.println("Good");
                } else if (score >= 50) {
                    System.out.println("Average");
                } else {
                    System.out.println("Fail");
                }
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score");
                } else if (score >= 50) {
                    System.out.println("Pass");
                } else {
                    System.out.println("Fail");
                }
            }

            
            
            System.out.println("Do you want to enter another student? (yes/no) ");
            continueProgram = scanner.nextLine();


        }
        
        
    }
}
