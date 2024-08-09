package session_19_JavaStream.challenge;

// Given a string, use streams to count the number of vowels in it. (Input: String sentence = "Hello World";)


public class Challenge8 {

    public static void main(String[] args) {

        String sentence = ("Hello World");

        int vowelCount = (int) sentence.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();

        System.out.println("The number of vowels are: " + vowelCount);
    }
}
