import java.util.Scanner;

public class IfElseUserInput {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 70) {
            System.out.println("Good");
        } else if (score >= 50) {
            System.out.println("Average");
        }else {
            System.out.println("Fail");
        }


        scanner.close();
    }   
}
