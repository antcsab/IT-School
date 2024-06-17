package session_4_java_operators_and_loops.challenges;

// Write a Java program to declare two integer variables firstNumber and secondNumber with values. Use an equality
// operator to compare these two numbers and print the result. Do the same for two String objects firstString and
// secondString with the same value, but use the equals() method for comparsion. Print the result.

public class Challenge4_2 {

    public static void main(String[] args) {
        int firstNumber = 23;
        int secondNumber = 41;

        if (firstNumber == secondNumber) {
            System.out.println("The firstNumber and the secondNumber are equal");
        } else {
            System.out.println("The numbers are not equal");
        }


        String firstString = new String("Antal Csaba");
        String secondString = new String("Antal Csaba");

        if (firstString.equals(secondString)) {
            System.out.println("The firstString and secondString are the same object");

        } else
            {
                System.out.println(firstString.equals(secondString) + "The firstString and the secondString are" +
                        " not the same object ");
            }
        }
    }
