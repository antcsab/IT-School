package session_16_collections_framework.challenge.arrayList;

// Write a Java program to search an element in a array list.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(125);
        myList.add(7);
        myList.add(45);
        myList.add(6);
        myList.add(23);
        myList.add(0);
        System.out.println("The created list is: " + myList);

        System.out.println("Add the element for searching for: ");
        Scanner sc = new Scanner(System.in);
        int newElement = sc.nextInt();
        
            if (myList.contains(newElement)) {
                System.out.println("In this list exists this element ");
            } else {
                System.out.println("This element do not exists in the list");
            }
        }
    }
