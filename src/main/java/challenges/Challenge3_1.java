package challenges;

import java.util.Scanner;

//1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication,
// division, and modulus.
public class Challenge3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the first number: ");
        int x = sc.nextInt();

        System.out.println(" Enter the second number: ");
        int y = sc.nextInt();
        int addition = x + y;
        int subtraction = x - y;
        int multiplication = x * y;
        int division = x / y;
        int modulus = x % y;

        System.out.println(" The addition of the numbers: " + addition);
        System.out.println(" The subtraction of the numbers: " + subtraction);
        System.out.println(" The multiplication of the numbers: " + multiplication);
        System.out.println(" The division of the numbers: " + division);
        System.out.println(" The modulus of the numbers: " + modulus);



    }
}
