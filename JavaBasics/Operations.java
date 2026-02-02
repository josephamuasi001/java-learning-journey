package JavaBasics;
public class Operations {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        int sum = num1 + num2;
        int difference = num2 - num1;
        int product = num1 * num2;
        double quotient = (double) num2 / num1;
        int modulos = num2 % num1;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulus: " + modulos);


        int age = 19;

        System.out.println("Is my age greater than 18? " + (age >= 18));
        System.out.println("Is my age between 18 and 65? " + (age > 18 && age < 65));

    }
}
