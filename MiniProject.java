import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your score (0-100): ");
            int score = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.println("Hello " + name + "!");

            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 50) {
                System.out.println("Average");
            } else {
                System.out.println("Fail");
            }

            System.out.print("Do you want to check another score? (yes/no): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Program ended. Goodbye!");
        scanner.close();
    }
}
