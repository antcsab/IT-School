package session_16_collections_framework.challenge.arrayList;

// Write a Java program to shuffle elements in a array list.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge10 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(56);
        myList.add(21);
        myList.add(-4);
        myList.add(-89);
        myList.add(0);
        System.out.println("The created list is: " + myList);

        Collections.shuffle(myList);
        System.out.println("The shuffled list is: " + myList);
    }
}
