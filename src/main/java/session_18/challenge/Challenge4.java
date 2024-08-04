package session_18.challenge;

//You are given a List<String> representing a list of words. Create a lambda expression to sort the list in alphabetical
//order. Next, modify your lambda expression to sort the list in reverse alphabetical order.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Challenge4 {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("Roma", "Paris", "Milano", "Bruxeles", "Antwerp", "Achen");
        System.out.println("The list in alphabetical order is: ");
        myList.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("The list in reverse order is :");
        myList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
