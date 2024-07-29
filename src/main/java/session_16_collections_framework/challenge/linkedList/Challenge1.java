package session_16_collections_framework.challenge.linkedList;

// Write a Java program to append the specified element to the end of a linked list.

import java.util.LinkedList;

public class Challenge1 {

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(15);
        myLinkedList.add(65);
        myLinkedList.add(4);
        myLinkedList.add(85);
        myLinkedList.add(-2);
        myLinkedList.add(54);
        myLinkedList.add(32);
        System.out.println(myLinkedList);
        myLinkedList.add(7, 23);
        System.out.println("The new element append to the end of the list: " + myLinkedList);
    }
}
