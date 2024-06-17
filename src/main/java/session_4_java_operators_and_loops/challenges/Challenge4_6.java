package session_4_java_operators_and_loops.challenges;

// Write a Java program where you declare an integer variable temperature. Assign a value to it and print "Hot" if the
// temperature is more than 30. "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.

public class Challenge4_6 {

    public static void main(String[] args) {
        int temp = 25;
        if (temp>30){
            System.out.println("The temperature is hot");}
        else {
            if (temp>20) {
                System.out.println("The temperature is warm");}
            else {
                System.out.println("The temperature is cold");
            }
        }

    }
}
