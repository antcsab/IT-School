package session_19_JavaStream.challenge;

// Given a list of sentences, use flatMap to create a list of all words in all the sentences, and then find the most
// frequently occurring word. (Input: List<String> sentences = Arrays.asList("Hello World", "Hello Everyone",
// "Welcome to the World of Java");)

import java.util.Arrays;
import java.util.List;

public class Challenge9 {

    public static void main(String[] args) {

        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the world of Java");
        sentences.stream()
                .flatMap(String::lines)
                .toList();

        System.out.println(sentences);

    }
}
