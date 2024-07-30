package session_16_collections_framework.challenge.arrayList;

// Write a Java program to update specific array element by given element.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(63);
        myList.add(-41);
        myList.add(0);
        System.out.println("The created list is: " + myList);

        System.out.println("Add a new element to the list: ");
        Scanner sc = new Scanner(System.in);
        int newElement = sc.nextInt();
        myList.add(newElement);

        System.out.println("The new List with the added element is: " + myList);
    }
}
