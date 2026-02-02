package JavaBasics;
import java.util.Scanner;

public class StudentsReusltManager {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean keepRunning = true;  
    String studentName;
    int studentScore;
    int totalStudents = 0;
    int totalFailed = 0;
    int totalPassed = 0;
    

        while (keepRunning) {
            System.out.println("1. Add student details ");
            System.out.println("2. Exit");
            System.out.println("Choose an option ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            if (option == 1) {
                //Asking for student name
                System.out.println("Enter your name here: ");
                studentName = scanner.nextLine();

            //Asking for student score
                System.out.println(studentName + " Enter your score here(0-100): ");
                studentScore = scanner.nextInt();
                scanner.nextLine();

                if (studentScore < 0 || studentScore > 100) {
                    System.out.println("Invalid score");
                    System.out.println("Do you want to enter another student score ?");
                    String choice = scanner.nextLine();
                    if (choice.equalsIgnoreCase("yes")) {
                        keepRunning = true;
                    } else {
                        System.out.println("Goodbyee!! ");
                        System.out.println("---- SUMMARY ----");
                        System.out.println("Total students: " + totalStudents);
                        System.out.println("Passed: " + totalPassed);
                        System.out.println("Failed: " + totalFailed);
                        System.out.println( "----------------" );
                        keepRunning = false;
                    }

                } else {
                    if (studentScore >= 90) {
                        System.out.println("A");
                        totalStudents++;
                        totalPassed++;
                    } else if (studentScore >= 70) {
                        System.out.println("B");
                        totalStudents++;
                        totalPassed++;
                    } else if (studentScore >= 50) {
                        System.out.println("C");
                        totalStudents++;
                        totalPassed++;
                    } else {
                        System.out.println("F");
                        totalStudents++;
                        totalFailed++;
                    }
                }    
            } else if (option == 2) {
                System.out.println("Goodbyee!! ");
                System.out.println("---- SUMMARY ----");
                System.out.println("Total students: " + totalStudents);
                System.out.println("Passed: " + totalPassed);
                System.out.println("Failed: " + totalFailed);
                System.out.println( "----------------" );
                keepRunning = false;
            } else {
                System.out.println("Invalid option");
                keepRunning = true;
            }
        scanner.close();
        }
    }
}
