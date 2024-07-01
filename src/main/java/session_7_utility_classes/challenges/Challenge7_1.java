package session_7_utility_classes.challenges;

// Displaying Today's Date
//Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
//Expected Output: Today's date in the format YYYY-MM-DD.

import java.time.LocalDate;

public class Challenge7_1 {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("Today' s date is: " + ld);
    }
}
