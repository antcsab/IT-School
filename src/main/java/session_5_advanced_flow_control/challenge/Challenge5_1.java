package session_5_advanced_flow_control.challenge;

//Even or Odd Checker
//Write a Java program that takes an integer as input. If the number is even, prin "Even". If it's odd, print "Odd".

import java.util.Scanner;


public class Challenge5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it's even or odd: ");
        int number = sc.nextInt();
        sc.close();

        if (number % 2 == 0 ) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}
