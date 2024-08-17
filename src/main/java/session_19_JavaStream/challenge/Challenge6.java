package session_19_JavaStream.challenge;

// Create a stream of integers from an array and find the sum of all integers using the reduce method.
// (Input: Integer[] numbers = {1, 2, 3, 4, 5};)

import java.util.Arrays;
import java.util.List;

public class Challenge6 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, (Integer::sum));

        System.out.println("The sum of the numbers from the list is: " + sum);

    }
}
