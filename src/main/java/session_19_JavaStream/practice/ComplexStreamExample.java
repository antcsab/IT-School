package session_19_JavaStream.practice;

import java.util.Arrays;
import java.util.List;

public class ComplexStreamExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Alice");

        // Filter names that start with "J"
        // Make uppercase all the names
        // Sort names
        // Collect the result into a new list

        List<String> resultList = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(resultList);

    }
}
