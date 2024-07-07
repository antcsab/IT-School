package session_9_arrays.challenge;

//Create an ArrayList containing names of fruits. Implement a custom sorting mechanism to arrange them in descending
// order based on their length. If two fruits have the same length, sort them in alphabetical order.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Challenge9_7 {
    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Pear");
        fruitList.add("Cherry");
        fruitList.add("Mango");
        fruitList.add("Dates");
        fruitList.add("Strawberry");
        fruitList.add("Peach");
        fruitList.add("Blueberry");
        fruitList.add("Ananias");

        fruitList.sort(new Comparator<String>() {
            @Override
            public int compare(String fruit1, String fruit2) {
                if (fruit1.length() == fruit2.length()) {
                    return fruit1.compareTo(fruit2);
                }
                return Integer.compare(fruit1.length(), fruit2.length());
            }
        });
        for (int index = 0; index < fruitList.size(); index--) {

        }
        System.out.println("My fruit list in descending order is: " + fruitList);
    }
}
