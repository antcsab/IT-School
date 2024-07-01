package session_8_recap.practice;

import java.util.Scanner;

public class Reverser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        sc.close();

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }
    }
}
