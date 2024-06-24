package session_6_java_core_apis.challenges;

//Removing Vowels
//Description: Create a Java program that uses the StringBuilder class to remove all the vowels from an input string.

import java.util.Scanner;

public class Challenge6_4 {
    public static void main(String[] args) {
        System.out.println("Enter an input String: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        sc.close();

        StringBuilder sb = new StringBuilder(st);

        for (int i = st.length(); i > 0; i--) {
            char ch = st.charAt(i - 1);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y') {
                sb.deleteCharAt(i - 1);
            }
        }
        System.out.println("The String after remove the vowels is: ");
        System.out.println(sb);


    }
}