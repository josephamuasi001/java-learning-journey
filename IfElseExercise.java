public class IfElseExercise {
    public static void main(String[] args) {
        int age = 19;

        if (age < 13) {
            System.out.println("Child");
        } else if (age >=13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >=20 && age <=64) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}
