package session_4_java_operators_and_loops.challenges;

//Write a Java program to declare an integer variable age with a value of 20. Print a statment saying "I am adult"
// if age is 18 or more, else print "I am not an adult" .

public class Challenge4_3 {

    public static void main(String[] args) {
        int age = 20;
        if (age > 18) {
            System.out.println("I am adult");
        } else {
            System.out.println("I am not an adult");
        }
    }
}
