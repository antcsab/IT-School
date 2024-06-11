package session_3_java_operators;

public class PostIncrementAndDecrementOperators {
    public static void main(String[] args) {
        //post - increment operator
        int x = 5;
        int y = x++;

        System.out.println("x: " + x); //6
        System.out.println("y: " + y); //5

        //post decrement

        int z = 4;
        int W = z--;
        System.out.println("z: " + z); //3
        System.out.println("w: " + W); //4

        int b = 3;
        int c = ++b * 5 / b-- + --b;
        System.out.println(" b is "  +b);
        System.out.println(" c is "  +c);
    }
}