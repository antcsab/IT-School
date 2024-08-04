package session_18.challenge;

// Write a program that uses lambda expressions to filter a list of integers and return only the even numbers

import java.util.Arrays;
import java.util.List;

public class Challenge1 {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(5, 9, 20, 0, -45, 10);
        System.out.println("The even numbers are: ");
        myList.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.print("  " + number));
    }
}
