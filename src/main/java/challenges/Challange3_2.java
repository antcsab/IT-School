package challenges;

//Create a Java program where you increment and decrement the same variable. Display the value of the variable after
// each operation.

public class Challange3_2 {

    public static void main(String[] args) {
        int x = 23;
        int y = x++;
        int z = y--;
        System.out.println("The value of the variable is: " + x);
        System.out.println("The increment of the variable is:  " + y);
        System.out.println("The decrement of the variable is:  " + z);



    }
}
