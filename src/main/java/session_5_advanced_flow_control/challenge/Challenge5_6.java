package session_5_advanced_flow_control.challenge;

//While Loop
//Write a program that asks the user to enter numbers. The program should continue prompting the user until they enter
//-1. After they enter -1, print the sum off all numbers entered ( excluding -1).

import java.util.Scanner;

public class Challenge5_6 {

    public static void main(String[] args) {

        int n = 0;
        int sum = 0;
        System.out.println("Enter the numbers");
        while (n != -1) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            sum = sum + n;
        }

        System.out.println("The sum of the numbers until -1 is: " + sum);
    }
}
