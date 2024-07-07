package session_9_arrays.challenge;

// Given a LinkedList storing student names, write a program that checks if a particular student name exists in
// the list. If it does, remove that name from the list.

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Challenge9_6 {

    public static void main(String[] args) {
        LinkedList<String> studentNames = new LinkedList<>();
        studentNames.add("George");
        studentNames.add("Felix");
        studentNames.add("Leo");
        studentNames.add("Vanessa");
        studentNames.add("Maicon");
        studentNames.add("Rebecca");
        studentNames.add("Brianna");
        System.out.println("Enter a student name: ");

        Scanner sc = new Scanner(System.in);
        String scStudent = sc.nextLine();
        sc.close();

        studentNames.remove(scStudent);
        System.out.println("The new student list is: " + studentNames);
    }
}
