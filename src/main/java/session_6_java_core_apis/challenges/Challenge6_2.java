package session_6_java_core_apis.challenges;

//Palindrome Checker
//Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class.
//A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.

import java.util.Scanner;

public class Challenge6_2 {

    public static void main(String[] args) {
        System.out.println("Enter a String to verify if is palindrome or not ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        sc.close();
        StringBuilder palindrome = new StringBuilder(st).reverse();

        if (st.equals(palindrome.toString())) {
            System.out.println(palindrome + " it is a palindrome String");
        } else {
            System.out.println(palindrome + " it is Not a palindrome String");
        }

    }
}