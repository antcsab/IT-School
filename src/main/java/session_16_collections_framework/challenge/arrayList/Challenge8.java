package session_16_collections_framework.challenge.arrayList;

// Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Challenge8 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(56);
        myList.add(21);
        myList.add(-4);
        myList.add(-89);
        myList.add(0);
        System.out.println("The created list is: " + myList);
        myList.sort(Comparator.naturalOrder());
        System.out.println("The list ordered from the min element to max element is: " + myList);
    }
}
