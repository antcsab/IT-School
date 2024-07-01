package session_7_utility_classes.challenges;

//Date Decomposition
//Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year,
// month, and day components separately.
// Input: A date in the format YYYY-MM-DD.
//Expected Output:
//makefile
//Copy code
//Year: YYYY
//Month: MM
//Day: DD


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Challenge7_2 {
    public static void main(String[] args) {

        System.out.println("Enter a date for display the components (yyyy-MM-DD): ");
        Scanner sc = new Scanner(System.in);
        String dateString = sc.nextLine();
        sc.close();

        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        displayDateComponents(date);
    }
    public static void displayDateComponents(LocalDate date) {
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonthValue());
        System.out.println("Day: " + date.getDayOfMonth());
    }
}
