package session_16_collections_framework.challenge.arrayList;

// Write a Java program to create a new array list, add some colors (string) and print out the collection.

import java.util.ArrayList;
import java.util.List;

public class Challenge1 {
    public static void main(String[] args) {

        List<String> color = new ArrayList<>();
        color.add("Blue");
        color.add("Green");
        color.add("Yellow");
        color.add("Black");
        color.add("Purple");
        color.add("Blue");
        color.add("Orange");
        System.out.println("The color collection is: " + color);
    }
}
