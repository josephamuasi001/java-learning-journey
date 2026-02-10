public class NewExercise {
    public static void main(String[] args) {
        int k = 8;
        int result = squareNumber(k);
        System.out.println("The square of " + k + " is " + result);

        int j = 8;
        boolean status = isAdult(j);
        System.out.println("You are an adult: " + status);
    }
    public static int squareNumber(int num1) {
        return (num1 * num1 );
    }

    public static boolean isAdult(int age) {
        if (age >= 18 ) {
            return true;
        } else {
            return false;
        }
    }
}
