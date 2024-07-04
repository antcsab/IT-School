package session_7_utility_classes.challenges;
//Getting Current Time
//Description: Write a method named displayCurrentTime that prints the current time to the console.
//Expected Output: The current time in the format HH:MM:SS.

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class challenge7_6 {

    public static void main(String[] args) {
        displayCurentTime();
    }

    private static void displayCurentTime() {
        System.out.println("The current time in the format HH:MM:SS. is: ");
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
