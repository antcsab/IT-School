package session_9_arrays.practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListPractice {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Charlie");
        names.add("John");

        //name = {Alice, Charlie, John}
        //index   0         1       2

        boolean isListEmpty = names.isEmpty();
        System.out.println("Is list empty? " + isListEmpty);

        for (String name : names) {
            System.out.println(name + " ");
        }

        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", " Banana", "Cherry"));
        System.out.println(fruits.contains("Apple"));
        String cherryValue = fruits.get(2);
        System.out.println("Cherry value: " + cherryValue);

        for (int index = 0; index < fruits.size(); index++) {
            System.out.println(fruits.get(index)+" ");
        }
    }
}
