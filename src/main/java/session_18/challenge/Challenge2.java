package session_18.challenge;

// Write a program that uses lambda expressions to sort a list of strings in alphabetical order.

import java.util.Arrays;
import java.util.List;

public class Challenge2 {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("Roma", "Paris", "Milano", "Bruxeles", "Antwerp", "Achen");
        myList.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
