package session_19_JavaStream.challenge;

// Given a list of strings, use streams to create a single string which is a concatenation of all strings separated
// by a comma. (Input: List<String> strings = Arrays.asList("one", "two", "three", "four");)

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge4 {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("one", "two", "three", "four", "five");
        String concat = myList.stream()
                .collect(Collectors.joining(","));

        System.out.println("The concatenated list is: " + concat);
    }
}
