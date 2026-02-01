import java.util.Scanner;

public class AtmConsoleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0;
        boolean running = true;

        while (running) {
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Your current balance is $" + balance);
            } else if (choice == 2) {
                System.out.println("How much do you want to deposit? ");
                int deposit = scanner.nextInt();
                scanner.nextLine();
                if (deposit >= 0) {
                    balance += deposit;
                    System.out.println("Congrats! You have recieved $"
                    + deposit + " in your account. Your balance is $" + balance
                    );
                } else {
                    System.out.println("Invalid deposit");
                }
            } else if (choice == 3) {
                System.out.println("How much do you want to withdraw? ");
                int withdraw = scanner.nextInt();
                scanner.nextLine();
                if (withdraw > 0 && withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println(
                        "Congratulations, you have withdrawn $" 
                        + withdraw 
                        + "from you account. " 
                        + "Your remaining balance is $" + balance 
                    );
                } else if (withdraw > balance){
                    System.out.println("Invalid withdrawal, your don't have $" + withdraw + "in your balance $" + balance);   
                } else {
                    System.out.println("Invalid transaction made");
                }
                

            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM");
                running = false;
            } else {
                System.out.println("Invalid option");
            }
        }
    }
}
