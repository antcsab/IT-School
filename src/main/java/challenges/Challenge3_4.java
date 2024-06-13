package challenges;
// Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and
// then back down to 1.

public class Challenge3_4 {

    public static void main(String[] args) {
        int i = 10;
        System.out.print("The increment from 1 to 10 is: " );
        for (i=0; i<11; i++) {{
        System.out.print(" " + i);}}
        System.out.println(" ");
        int j = 10;
        System.out.println(" ");
        System.out.print("The decrement from 10 to 1 is: " );
        while (j>-1) {
        System.out.print(" " + j);
        j--;
        }
        }
}


