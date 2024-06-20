package session_5_advanced_flow_control.challenge;

// Ask the user to enter a string. Print the reversed version of this string.

import java.util.Scanner;

public class Challenge5_4method2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String st = sc.nextLine();

        char[] array = st.toCharArray();
        System.out.println("The revers of the entered String is: ");
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i - 1]);
        }
        sc.close();
    }
}
