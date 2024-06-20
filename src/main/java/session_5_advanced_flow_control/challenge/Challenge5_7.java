package session_5_advanced_flow_control.challenge;

//Do - While Loop
//Create a program where the user prompted to guess a predefined number. After each guess, the program should inform
// user if the guess is too high or too low. The program should keep prompting the user until they guess correctly.
//Using a do - while loop, ensure the user is always asked at least one.

import java.util.Scanner;

public class Challenge5_7 {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(" Enter the number let see if you know what number I think :) ");
        do {
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            if (number < 23) {
                System.out.println("Enter a higher number this number is to low ");
            } else {
                if (number > 23) {
                    System.out.println("Enter a lower number, this number is to high ");
                } else {
                    System.out.println("Yupppy, you guessed the number");
                    break;
                }
            }
        }
        while (number != 23);
    }
}
