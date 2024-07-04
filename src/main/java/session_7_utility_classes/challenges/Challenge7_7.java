package session_7_utility_classes.challenges;

//Date Arithmetic
//Description: Write a method named addWeeksToToday that accepts an integer as its argument. This integer denotes the
// number of weeks. The method should add this number of weeks to today's date and return the resultant date.
//Input: An integer n (e.g., 4).
//Expected Output: A date object that is n weeks from today.

import java.time.LocalDate;
import java.util.Scanner;

public class Challenge7_7 {

    public static void main(String[] args) {
        System.out.println("Add the number of the week: ");
        Scanner sc = new Scanner(System.in);
        int weeknumber = sc.nextInt();
        sc.close();

        System.out.println("The new date is: " + addweeksToToday(weeknumber));
    }

    private static LocalDate addweeksToToday(int weeknumber) {
        return LocalDate.now().plusWeeks(weeknumber);
    }
}
