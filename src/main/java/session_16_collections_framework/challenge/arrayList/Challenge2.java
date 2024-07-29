package session_16_collections_framework.challenge.arrayList;

// Write a Java program to iterate through all elements in a array list.

import java.util.ArrayList;
import java.util.List;

public class Challenge2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < 12; index++) {
            list.add(index);
        }
        System.out.println("Itarate all elements in the list: " + list);
    }
}