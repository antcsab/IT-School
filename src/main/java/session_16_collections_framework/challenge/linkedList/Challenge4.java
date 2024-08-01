package session_16_collections_framework.challenge.linkedList;

// Write a Java program to iterate a linked list in reverse order.

import java.util.Collections;
import java.util.LinkedList;

public class Challenge4 {

    public static void main(String[] args) {

        LinkedList<Integer> myLinkedList = new LinkedList<>();
        for (int index = 0; index < 7; index++) {
            myLinkedList.add(index);
        }
        System.out.print("The generate list is: ");
        System.out.println(" " + myLinkedList);
        for (int index = 7; index > 0; index--) {
            Collections.reverse(myLinkedList);
        }
        System.out.println();
        System.out.println("The reversed list is: " + myLinkedList);
    }
}




