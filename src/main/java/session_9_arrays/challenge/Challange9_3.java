package session_9_arrays.challenge;

//Create
// - 2 empty ArrayLists: studentList and graduateStudentList
// - populate studentList with 10 students
// - copy values from studentList to graduateStudentList
// -iterate through graduateStudentList and print each graduated student

import java.util.ArrayList;
import java.util.List;

public class Challange9_3 {

    public static void main(String[] args) {

        List<String> studentList = new ArrayList<>();
        studentList.add("Frank");
        studentList.add("Joe");
        studentList.add("Rebeca");
        studentList.add("Kimberly");
        studentList.add("Malcom");
        studentList.add("Rianna");
        studentList.add("Brooklyn");
        studentList.add("Tim");
        studentList.add("George");
        studentList.add("Vanessa");

        List<String> graduateStudentList = new ArrayList<>();
        graduateStudentList.add(studentList.get(1));
        graduateStudentList.add(studentList.get(7));
        graduateStudentList.add(studentList.get(4));
        graduateStudentList.add(studentList.get(9));
        graduateStudentList.add(studentList.get(6));

        System.out.println("The graduate students are: ");
        for (String student : graduateStudentList) {
            System.out.println(student);
        }
    }
}
