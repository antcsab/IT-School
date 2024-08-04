package session_18.challenge;

// Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers

import java.util.Arrays;
import java.util.List;

public class Challenge3 {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(2, 4, 8, 3, 4, 10);
        int sum = myList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("The sum of the numbers is: " + sum);
    }
}
