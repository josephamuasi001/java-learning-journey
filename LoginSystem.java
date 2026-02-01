import java.util.Scanner;

public interface LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 3;
        boolean running = true;

        while (counter != 0 && running) {
            String correctUsername = "admin";
            String correctPassword = "1234";
            System.out.println("Enter your username: ");
            String userName = scanner.nextLine();
            System.out.println("Enter your password: ");
            String password = scanner.nextLine();
            
            if (userName == correctUsername && password == correctPassword) {
                System.out.println("Login successful !");
                running = false;
            } else if (userName != correctUsername || password != correctPassword) {
                System.out.println("Invalid credentials");
                counter -= 1;
                System.out.println("You have " + counter + "attempts remaining");

            }else {
                System.out.println("Account locked, you have " + counter + " attempts!");
                running = false;
            }
            

        }
    }
}
