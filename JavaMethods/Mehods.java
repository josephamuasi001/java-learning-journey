import java.util.Scanner;

public class Mehods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter your name here: ");
        String nameU = scanner.nextLine();
        System.out.println("Enter your age here: ");
        int ageU = scanner.nextInt();
        sayHello(nameU, ageU);
        scanner.close();
    }
    public static void sayHello(String name, double age) {
        System.out.println("Hello " + name );
        System.out.println("You are " + age + " years ");
    }
}