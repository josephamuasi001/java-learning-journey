package JavaBasics;
public class Loops {
    public static void main(String[] args) {
        // For Loop Example
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop Example
        System.out.println("\nWhile Loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-While Loop Example
        System.out.println("\nDo-While Loop:");
        int number = 1;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number <= 5);
    }
}
