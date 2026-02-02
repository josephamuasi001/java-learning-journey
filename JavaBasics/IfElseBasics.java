package JavaBasics;
public class IfElseBasics {
    public static void main(String[] args) {
        // if(condition) {
        //     // code to be executed if condition is true
        // } else {....}


        //Simple Example

        int age = 17;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }

        // Multiple Conditions Example

        int score = 85;

        if (score >= 90) {
            System.out.println("You got an A.");
        } else if (score >= 80) {
            System.out.println("You got a B.");
        } else if (score >= 70) {
            System.out.println("You got a C.");
        } else if (score >= 60) {
            System.out.println("You got a D.");
        } else {
            System.out.println("You got an F.");
        }

        // Using Logical Operators int age = 20;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("You can enter.");
        } else {
            System.out.println("Access denied.");
        }
        

        

    }
}
