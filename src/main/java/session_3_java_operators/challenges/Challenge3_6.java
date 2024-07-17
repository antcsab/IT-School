package session_3_java_operators.challenges;
//Write a Java program that takes two numbers from the user and uses relational operators to display whether the first
//number is greater than, less than, or equal to the second number.

import java.util.Scanner;

public class Challenge3_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("The first number is: ");
        int a = scanner.nextInt();
        System.out.println("The second number is: ");
        int b = scanner.nextInt();
        if (a>b) {
            System.out.println(a + " is greater then " + b);
        }
        else  if (a<b) {
            System.out.println(a + " is smaller than " + b);}
        else {
            System.out.println("The numbers are equal");
        }
    }
}

