import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //1. First import the Scanner class(Outside main method)
        //2. Create a Scanner object
        //3. Use Scanner methods to read input
        //4. Close the Scanner object
        // Example: Reading a string input from the user

        //Exercise 

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name here: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name);

        System.out.print("Enter your age here: ");
        int age = scan.nextInt();
        System.out.println("You are " + age + " years old.");

        
        scan.close();
    }
}
