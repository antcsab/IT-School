package session_7_utility_classes.challenges;

// Comparing User-Entered Dates
// Description: Write a method named areDatesEqual that reads two dates from the console and returns true if they are
// equal, and false otherwise.
// Input: Two dates entered by the user in the format YYYY-MM-DD.
//Expected Output:
//      true if both dates are equal.
//      false if they are different.


import java.util.Objects;
import java.util.Scanner;

public class challenge7_4 {

    public static void main(String[] args) {
        System.out.println("Enter the first date: ");
        Scanner sc = new Scanner(System.in);
        String dateString1 = sc.nextLine();
        System.out.println("Enter the second date");
        String dateString2 = sc.nextLine();
        sc.close();

        System.out.println(areDatesEqual(dateString1, dateString2));
    }

    private static boolean areDatesEqual(String dateString1, String dateString2) {
        return Objects.equals(dateString1, dateString2);
    }
}

