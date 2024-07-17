package session_3_java_operators.challenges;
// Create a program that takes two byte values, adds them together, and stores the result in a byte variable.

public class Challenge3_8 {

    public static void main(String[] args) {
        byte a = 23;
        System.out.println("The first byte value: " + a);
        byte b = -87;
        System.out.println("The second byte value: " + b);

        int sum = a + b;
        sum = (byte) sum;
        System.out.println("The sum of the byte values is: " + sum);
    }
}
