package session_16_collections_framework.challenge.linkedList;

// Write a Java program to iterate through all elements in a linked list

import java.util.LinkedList;

public class Challenge2 {

    public static void main(String[] args) {

        LinkedList<Integer> myLinkedList = new LinkedList<>();
        for (int index = 0; index < 7; index++) {
            myLinkedList.add(index);
        }
        System.out.println("The generate list is: ");
        for (int number : myLinkedList) {
            System.out.print("  " + number);
        }
    }
}
