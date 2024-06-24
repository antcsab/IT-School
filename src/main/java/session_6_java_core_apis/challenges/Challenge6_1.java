package session_6_java_core_apis.challenges;

//Reverse a String
//Description: Use the StringBuilder class to write a program that reverses an input string. For example, the input
// "hello" should return "olleh".

public class Challenge6_1 {

    public static void main(String[] args) {
        String input = "Hello";
        StringBuilder reversed = new StringBuilder(input).reverse();
        System.out.println("The reverse of the input word is: " + reversed);

    }
}