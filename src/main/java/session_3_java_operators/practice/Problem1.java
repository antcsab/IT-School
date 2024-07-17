package session_3_java_operators.practice;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int x = sc.nextInt();

        System.out.println(" Please enter the second number: ");
        int y = sc.nextInt();
        double power = Math.pow(x, y);
        System.out.println(" Remainder: " + y);
        System.out.println(" Power: " + power);
    }
}
