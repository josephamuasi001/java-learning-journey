package JavaBasics;
import java.util.Scanner;
public class NumberIntelliEngine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter ? ");
        int askNumber = input.nextInt();
        input.nextLine();
        if (askNumber < 3) {
            System.out.println("Invalid, number must be greater than 3");
            askNumber = input.nextInt();
        } 
        int sum = 0;
        for (int i = 1; i <= askNumber; i++) {
            System.out.println("Enter score " + i);
            int respondNumber = input.nextInt();
            input.nextLine();
            sum += respondNumber;  
        }
        System.out.println("Total score: " + sum);
    }
}

