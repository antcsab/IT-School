package session_5_advanced_flow_control.challenge;

//Fibonacci Series Generator
//Write a program that generates and prints the first n number of the Fibonacci series, where n is provided by the user.

import java.util.Scanner;

public class Challenge5_5 {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int f0 = 0;
        int f1 = 1;

        System.out.println("The numbers of the Fibonacci series for " + n + " are: ");
        for (int i = 0; i < n; i++) {
            int next = f0 + f1;
            f0 = f1;
            f1 = next;
            System.out.print(" " + next);
        }
    }
}
