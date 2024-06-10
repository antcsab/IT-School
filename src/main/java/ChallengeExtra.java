package practice;

import java.util.Scanner;

public class ChallengeExtra{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int Number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int Number2 = scanner.nextInt();
        int addition = Number1 + Number2;
        int minus = Number1 - Number2;
        System.out.println("The addition of the numbers is: " + addition);
        System.out.println("The minus of the numbers is: " + minus);
        scanner.close();
    }
}
