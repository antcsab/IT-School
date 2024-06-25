package session_7_utility_classes.practice;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String userName = scanner.nextLine();

        System.out.println("Please enter your name: ");
        int userAge = scanner.nextInt();

        System.out.println("Are you a student? (True/False)");
        boolean isStudent = scanner.nextBoolean();
        scanner.close();

        System.out.println("User " + userName + " age " + userAge + " is student " + isStudent);
    }
}
