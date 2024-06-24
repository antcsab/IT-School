package session_6_java_core_apis.challenges;

//Word Capitalizer
//Description: Write a program that capitalizes the first letter of every word in a sentence using the
// StringBuilder class.

import java.util.Scanner;

public class Challenge6_5 {

    public static void main(String[] args) {
        System.out.println("Write a sentence that want to be used for capitalize every words first letter: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        sc.close();

        StringBuilder sb = new StringBuilder();
        String[] splitText = st.split(" ");
        for (int i = 0; i < splitText.length; i++) {
            String word = splitText[i];
            String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
            sb.append(capitalized).append(" ");
        }
        System.out.println(sb);
    }
}