package session_16_collections_framework.challenge.arrayList;

// Write a Java program to copy one array list into another.

import java.util.ArrayList;
import java.util.List;

public class Challenge9 {

    public static void main(String[] args) {
        List<Integer> myList1 = new ArrayList<>();
        myList1.add(2);
        myList1.add(96);
        myList1.add(0);
        myList1.add(-7);
        myList1.add(74);
        myList1.add(5);
        System.out.println("The first arrayList is: " + myList1);

        List<Integer> myList2 = new ArrayList<>();
        myList2.add(3);
        myList2.add(-963);
        myList2.add(77);
        myList2.add(11);
        myList2.add(83);
        System.out.println("The second arrayList is:  " + myList2);

        myList1.addAll(myList2);
        System.out.println("The new concatenated list is: " + myList1);
    }
}
