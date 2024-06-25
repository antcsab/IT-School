package session_7_utility_classes.practice;

public class MainStudent {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 23;


        System.out.println(student1);

        Student student2 = new Student();
        student1.name = "John";
        student1.age = 23;

        System.out.println(student1.equals(student2));

    }
}
