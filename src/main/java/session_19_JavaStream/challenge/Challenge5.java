package session_19_JavaStream.challenge;

// Given a list of people with attributes: first name, last name, and age; use streams to find all people who are older
// than 18 years.
//class Person {
//    String firstName;
//    String lastName;
//    int age;
//}
//List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));

import java.util.Arrays;
import java.util.List;

public class Challenge5 {

    public static void main(String[] args) {

        List<PersonCh5> people = Arrays.asList(new PersonCh5("Alice", "Johnson", 20),
                new PersonCh5("Bob", "Smith", 17));

        List<String> resultList = people.stream()
                .filter(user -> user.getAge() > 18)
                .map(user -> user.getFirstName() + " " + user.getLastName())
                .sorted()
                .toList();

        System.out.println(resultList + " is older than 18");
    }
}
