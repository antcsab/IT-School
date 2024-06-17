package session_4_java_operators_and_loops.challenges;

//Write a Java program that determines the type of a triangle based on its side. Declare three variables sideOne,
//sideTwo and sideThree to represent the sides of the triangle. Use the ternary operator to determine and print whether
//the triangle is "Equilateral" , "Isoscel", or "Scalene.

public class Challenge4_7 {

    public static void main(String[] args) {
        int sideOne = 3;
        int sideTwo = 4;
        int sideThree = 5;
        if ((sideOne == sideTwo) && (sideOne == sideThree)){
            System.out.println("The trinagle is equilateral");
        } else {
            if ( sideOne == sideTwo || sideTwo == sideThree){
                System.out.println("The triangle is isoscel");
            }
            else{
                System.out.println("The triangle is scalene");
            }
        }

    }
}
