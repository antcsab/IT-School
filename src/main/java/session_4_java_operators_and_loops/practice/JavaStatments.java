package session_4_java_operators_and_loops.practice;

public class JavaStatments {

    public static void main(String[] args) {
        int currentYeaer = 2024;
        int birthday = 1990;
        int age = currentYeaer - birthday;

        System.out.println("Age is " + age);

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligibble to vote");
        }
        // ctrl + alt + l - aseaza liniile in ordine - code formatting
        int number = 20;
        if (number > 0) {
            System.out.println("Number is positive");
        } else {
            if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
            }
        }
    }
}
