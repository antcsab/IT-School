package session_9_arrays.challenge;

// Create an ArrayList that stores city names. Add at least five city names initially. Then, prompt the user to add a
// city name. If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to
// the list.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge9_5 {

    public static void main(String[] args) {
        List<String> cityNames = new ArrayList<>();
        cityNames.add("Tokyo");
        cityNames.add("Frankfurt");
        cityNames.add("Jakarta");
        cityNames.add("Milano");
        cityNames.add("Denver");

        System.out.println("Add city names to let see if it's matching: ");
        Scanner sc = new Scanner(System.in);
        String inputCitys = sc.nextLine();

        if (cityNames.contains(inputCitys)) {
            System.out.println("This city is already exist, it is a duplicate");
        } else {
            cityNames.add(inputCitys);
        }
        System.out.println("The new list with cites contains the bellow cites: " + cityNames);
        sc.close();
    }
}
