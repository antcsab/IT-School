package session_9_arrays.challenge;

// Create a wishlist for christmas with ArrayList and print the values

import java.util.ArrayList;
import java.util.List;

public class Challenge9_2 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Chocolate");
        arrayList.add("Bicycle");
        arrayList.add("Train");
        arrayList.add("Candis");
        arrayList.add("Candles");
        arrayList.add("Puzzle");

        System.out.println("My Christmas wishlist for this year is: " + arrayList);
    }
}
