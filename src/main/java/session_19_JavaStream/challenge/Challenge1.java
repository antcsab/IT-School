package session_19_JavaStream.challenge;

// Given a list of integers, create a new list that contains only the even numbers. Use streams to achieve this.
// (Input: List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);)

import java.util.Arrays;
import java.util.List;

public class Challenge1 {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(3, 4, 7, 8, 12, 15);
        List<Integer> evenList = myList.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println("The even list is: " + evenList);
    }
}