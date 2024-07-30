package session_16_collections_framework.challenge.arrayList;

// Write a Java program to remove the third element from a array list.

import java.util.ArrayList;
import java.util.List;

public class Challenge6 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(6);
        myList.add(965);
        myList.add(23);
        myList.add(78);
        myList.add(15);
        myList.add(-1);
        System.out.println("The created List is: " + myList);
        myList.remove(3);
        System.out.println("The list after removed the third element is: " + myList);
    }
}
