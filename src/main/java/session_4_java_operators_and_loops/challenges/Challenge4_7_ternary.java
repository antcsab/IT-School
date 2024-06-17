package session_4_java_operators_and_loops.challenges;

//Write a Java program that determines the type of a triangle based on its side. Declare three variables sideOne,
//sideTwo and sideThree to represent the sides of the triangle. Use the ternary operator to determine and print whether
//the triangle is "Equilateral" , "Isoscel", or "Scalene.


public class Challenge4_7_ternary {

    public static void main(String[] args) {
        int sideOne = 3;
        int sideTwo = 4;
        int sideThree = 5;
        String triangleType = (sideOne == sideTwo && sideOne == sideThree) ? "The triangle is equilateral" :
                (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) ? "The triangle is isosceles" :
                        "The triangle is scalene";

        System.out.println(triangleType);

    }

}
