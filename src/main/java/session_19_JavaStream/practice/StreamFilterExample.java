package session_19_JavaStream.practice;

import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Alice");

        //filter and print names that start with J
        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(name -> System.out.println(name));
    }
}
