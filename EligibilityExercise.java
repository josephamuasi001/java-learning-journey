public class EligibilityExercise {
    public static void main(String[] args) {
        int age = 19;
        boolean hasID = true;

        System.out.println("Are you an adult? " + (age >= 18));
        System.out.println("Are you a senior? " + (age >= 65));

        System.out.println("Are you eligible to vote? " + (age >= 18 && hasID));

    }
}
