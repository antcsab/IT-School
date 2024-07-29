package session_16_collections_framework.challenge.arrayList;

// Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.List;

public class Chellange4 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for (int index = 0; index < 20; index++) {
            myList.add(index);
        }
        System.out.println("My list is: " + myList);
        System.out.println("Te retrieved element is: " + myList.get(10));

        myList.remove(10);
        System.out.println("My list after retrieve an element: " + myList);
    }
}
