package session_19_JavaStream.challenge;

// Use streams to transform a list of strings into a list of their respective lengths.
// (Input: List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");)

import java.util.Arrays;
import java.util.List;

public class Challenge7 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");

        List<Integer> length = strings.stream()
                .map(String::length)
                .toList();

        System.out.println("The length of each strings are: " + length);

    }
}
