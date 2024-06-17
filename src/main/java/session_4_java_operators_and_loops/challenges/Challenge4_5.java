package session_4_java_operators_and_loops.challenges;

// Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your program to print
// only the even numbers from 1 to 10.

public class Challenge4_5 {

    public static void main(String[] args) {
        System.out.print("The numbers from one to ten: ");
        for (int i = 0; i < 11; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.print("The even numbers are: ");
        for (int i = 0; i < 12; i = i + 2) {
        System.out.print(" " +i);}
        System.out.println();

        System.out.print("The odds numbers are: ");
        for (int i = 0; i<11; i = i + 3) {
            System.out.print(" " +i);}
    }
}
