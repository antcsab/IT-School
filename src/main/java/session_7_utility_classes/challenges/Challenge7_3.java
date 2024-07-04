package session_7_utility_classes.challenges;

//Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
//Expected Output: A date object for 2025-8-19.

import java.time.LocalDate;

public class Challenge7_3 {
    private static LocalDate createSpecificDate() {
        return LocalDate.of(2025, 8, 19);
    }

    public static void main(String[] args) {
        System.out.println(createSpecificDate());
    }
}
