import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your name here: ");
            String name = scanner.nextLine();
            System.out.println("Enter your age here: ");
            int score = scanner.nextInt();
            
            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 50) {
                System.out.println("Average");
            } else {
                System.out.println("Fail");
            }

            System.out.println("Do you want to check another result? (yes/no): ");
            String answer = scanner.next();
        } while (answer.equalsIgnoreCase("yes"));   
        System.out.println("Program ended.Goodbye!");
         scanner.close();
    }
}