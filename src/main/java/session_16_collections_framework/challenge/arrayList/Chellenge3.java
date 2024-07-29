package session_16_collections_framework.challenge.arrayList;

// Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.List;

public class Chellenge3 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for (int index = 0; index < 15; index++) {
            myList.add(index);
        }
        myList.add(0, 23);
        System.out.println("My new list is: " + myList);
    }
}