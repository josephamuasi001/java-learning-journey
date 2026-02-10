public class NewExercise {
    public static void main(String[] args) {
        int k = 8;
        int result = squareNumber(k);
        System.out.println("The square of " + k + " is " + result);

        int j = 8;
        boolean status = isAdult(j);
        System.out.println("You are an adult: " + status);

        int t = 13;
        String temperature = checkTemperature(t);
        System.out.println("Your temperature is " + temperature);

        String usName = "admin";
        String usNum = "1234";
        String logIn = checkLogin(usName, usNum);
        System.out.println(logIn); 
    }
    // Square number method
    public static int squareNumber(int num1) {
        return (num1 * num1 );
    }
    //Method - isAdult
    public static boolean isAdult(int age) {
        if (age >= 18 ) {
            return true;
        } else {
            return false;
        }
    }

// Temperature method
    public static String checkTemperature(int temp) {
        if (temp >= 30) {
            return "Hot";
        }else if (temp >= 20) {
            return "Warm";
        } else {
            return "Cold";
        }

    }

    // Login System Exercise
    
    public static String checkLogin(String userName, String userpassword) {
        if (userName.equals("admin") && userpassword.equals("1234")) {
            return "Login successful";
        } else {
            return "Invalid login credentials";
        }
    }
}
