import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "admin";
        String correctPassword = "1234";
        int counter = 3;
        boolean loggedIn = true;
    

        while (counter > 0) {
            System.out.println("Enter your username: ");
            String userName = scanner.nextLine();
            System.out.println("Enter your password: ");
            String password = scanner.nextLine();
            
            if (userName.equalsIgnoreCase(correctUsername) && password.equalsIgnoreCase(correctPassword)) {
                System.out.println("Login successful !");
                loggedIn = true;
                break;
            } else  {
                counter -= 1;
                System.out.println("Invalid credentials");
                System.out.println("You have " + counter + " attempts remaining");

            }
        }    
        if (!loggedIn) {
            System.out.println("Account locked, you have " + counter + " attempts!");
        }       
    }
}
