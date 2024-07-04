package session_7_utility_classes.challenges;
//Is Today a Specific Date?
//Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
//Expected Output:
//true if today's date is 2019-12-10.
//false otherwise.


import java.time.LocalDate;

public class Challenge7_5 {

    public static void main(String[] args) {
        System.out.println(isTodaySpecificDate());
    }

    private static boolean isTodaySpecificDate() {
        return LocalDate.now().equals(LocalDate.of(2019, 12, 10));
    }
}