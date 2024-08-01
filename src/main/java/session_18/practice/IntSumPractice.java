package session_18.practice;

public class IntSumPractice {

    public static void main(String[] args) {

        IntSum result = (a, b) -> a + b;
        System.out.println("The sum of the numbers is: " + result.sum(10, 15));
    }
}
