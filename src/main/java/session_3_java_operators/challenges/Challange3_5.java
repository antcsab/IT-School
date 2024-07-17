package session_3_java_operators.challenges;
//Create a Java program that demonstrates the use of each compound assignment operator with integers.

public class Challange3_5 {

    public static void main(String[] args) {
        int x = 10;
        x += 2;
        System.out.println("The compound addition assignment: " + x);
        x -= 2;
        System.out.println("The compound subtraction assignment: " + x);
        x *= 2;
        System.out.println("The compound multiplication assignment: " + x);
        x /= 2;
        System.out.println("The compound division assignment: " + x);
        x %= 2;
        System.out.println("The compound modulus assignment: " + x);
        x &= 2;
        System.out.println("The compound Bitwise & assignment: " + x);
        x |= 2;
        System.out.println("The compound Bitwise | assignment: " + x);
        x ^= 2;
        System.out.println("The compound Bitwise ^ assignment: " + x);
        x >>= 2;
        System.out.println("The compound right-shift assignment: " +x);
        x >>>= 2;
        System.out.println("The compound right-shift filled 0 assignment: " +x);
        x <<= 2;
        System.out.println("The compound left-shift assignment:  " + x);

    }
}
