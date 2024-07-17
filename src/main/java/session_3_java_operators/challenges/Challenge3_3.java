package session_3_java_operators.challenges;
//Write a program to check if a number is positive or negative using logical complement operator;

import java.util.Scanner;

public class Challenge3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The checking number is: ");
        int a = scanner.nextInt();
        if (a>0) {
        System.out.println("The number is positive (+) ");
        }
        else if (a<0) {
        System.out.println("The number is negative (-)");
        }
            else {
        System.out.println("The number is zero (0)");}
    }
}
