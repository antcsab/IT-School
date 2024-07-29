package session_16_collections_framework.challenge.hashSet;

// Write a Java program to append the specified element to the end of a hash

import java.util.HashSet;

public class Challenge1 {

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<String>();
        mySet.add("Blue");
        mySet.add("Orange");
        mySet.add("Purple");
        mySet.add("Black");
        mySet.add("Green");
        System.out.println("My hashSet is: " + mySet);
        mySet.add("Yellow");
        System.out.println("The new hashSet is: " + mySet);
    }
}
