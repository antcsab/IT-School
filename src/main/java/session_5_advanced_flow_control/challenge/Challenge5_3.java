package session_5_advanced_flow_control.challenge;

// Counting Negative Numbers
// Given an array of integers, write a program to count and print the number of negative integers in the array.


public class Challenge5_3 {


    public static void main(String[] args) {
        int[] intArray = {2, -3, 1, 7, 65, -4, 5, -6, -34, 14};
        System.out.print("The negative numbers from the array are: ");
        int count = 0;
        for (int index = 0; index < 10; index++) {
            if (intArray[index] < 0) {
                System.out.print(intArray[index] + " , ");
                count++;
            }
        }
        System.out.println();
        System.out.println("In this array we have " + count + " negative numbers");
    }
}
