package session_4_java_operators_and_loops.challenges;

//Write a Java program to calculate the factorial of a number using a for loop. Declare an integer variable number and
// assign a value to it. Then calculate and print the factorial number.

public class Challenge4_8 {
    public static void main(String[] args) {
        int number = 8;
        int fact = 1;
        for (int i = 2; i < number; i++) {
            fact *= i;
        }
        System.out.println("The factorial of a number is: " + fact);
    }
}
