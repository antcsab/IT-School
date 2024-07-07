package session_9_arrays.challenge;

// Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.
public class Challenge9_4 {

    public static void main(String[] args) {
        int[] intArray = {23, -2, 5, 8, 14, 0, 546, 32, -415, 62};
        int even = 0;
        int odd;
        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] % 2 == 0) {
                even = even + 1;

            }
        }
        odd = intArray.length - even;
        System.out.println("In this array we have " + even + " even numbers");
        System.out.println("In this array we have " + odd + " odd numbers");
    }
}
