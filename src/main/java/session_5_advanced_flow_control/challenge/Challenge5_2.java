package session_5_advanced_flow_control.challenge;

// Month name finder
// Write a program that ask the user to enter  number between 1 and 12. Print the name of the corresponding month or
// "invalid month" if out of range

import java.util.Scanner;

public class Challenge5_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 12: ");
        int month = sc.nextInt();
        sc.close();

        final int January = 1;
        final int February = 2;
        final int March = 3;
        final int April = 4;
        final int May = 5;
        final int June = 6;
        final int July = 7;
        final int August = 8;
        final int September = 9;
        final int October = 10;
        final int November = 11;
        final int December = 12;


        switch (month) {
            case January:
                System.out.println("It's January");
                break;
            case February:
                System.out.println("It's February");
                break;
            case March:
                System.out.println("It's March");
                break;
            case April:
                System.out.println("It's April");
                break;
            case May:
                System.out.println("It's May");
                break;
            case June:
                System.out.println("It's June");
                break;
            case July:
                System.out.println("It's July");
                break;
            case August:
                System.out.println("It's August");
                break;
            case September:
                System.out.println("It's September");
                break;
            case October:
                System.out.println("It's October");
                break;
            case November:
                System.out.println("It's November");
                break;
            case December:
                System.out.println("It's December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
