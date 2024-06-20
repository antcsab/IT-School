package session_5_advanced_flow_control.challenge;

// Ask the user to enter a string. Print the reversed version of this string.

import java.util.Scanner;

public class Challange5_4method1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String st = sc.nextLine();
        String reversed = new StringBuilder(st).reverse().toString();
        System.out.println("The reverse of the String is: " + reversed);
        sc.close();
    }
}
