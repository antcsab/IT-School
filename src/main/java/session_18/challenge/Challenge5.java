package session_18.challenge;

// Create a functional interface that takes a list of integers and returns the maximum value from the list. Implement
// this interface using a lambda expression. Ensure your lambda correctly handles an empty list case.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge5 {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(3, 5, -9, 65, 12, 47, 32, 0, 10, 23);

        Challenge5interface function = new Challenge5interface() {

            @Override
            public int maximum(List<Integer> myList) {
                if (myList == null) {
                    return 0;
                }
                return Collections.max(myList);
            }
        };

        Challenge5interface lambda = myList1 -> {
            if (myList == null) {
                return 0;
            }
            return Collections.max(myList);
        };
        int max = lambda.maximum(myList);
        System.out.println("The maximum element of the list is: " + max);
    }
}
