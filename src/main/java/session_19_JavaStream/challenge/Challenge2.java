package session_19_JavaStream.challenge;

// Using a list of strings, find and print the longest string using Java streams.
// (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Challenge2 {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        Optional<String> longestString = myList.stream()
                .max(Comparator.comparingLong(String::length));

        System.out.println("The longest string in the list is: " + longestString);
    }
}
