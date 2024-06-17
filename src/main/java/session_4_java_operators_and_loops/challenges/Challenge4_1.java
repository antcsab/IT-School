package session_4_java_operators_and_loops.challenges;

// Write a Java program where you create two String objects named stringOne and stringTwo with the same value "openAI".
// Check and print whether they refer to the same object.

public class Challenge4_1 {

    public static void main(String[] args) {
        String stringOne = "OpenAI";
        String stringTwo = new String("OpenAI");
        System.out.println(stringOne==stringTwo);
        System.out.println(stringOne.equals(stringTwo));
    }
}
