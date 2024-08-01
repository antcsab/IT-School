package session_16_collections_framework.challenge.linkedList;

// Write a Java program to iterate through all elements in a linked list starting at the specified position

import java.util.LinkedList;

public class Challenge3 {

    public static void main(String[] args) {

        LinkedList<Integer> myLinkedList = new LinkedList<>();
        for (int index = 0; index < 7; index++) {
            myLinkedList.add(index);
        }
        System.out.println("The generate list is: ");
        for (int number = 3; number < myLinkedList.size(); number++) {
            System.out.print("  " + myLinkedList.get(number));
        }
    }
}
