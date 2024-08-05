package session_19_JavaStream.practice;

import java.util.Arrays;
import java.util.List;

public class CombinedStreamOperationExample {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", "Doe", 25),
                new User("Bob", "Smith", 28),
                new User("Alice", "Carter", 23)
        );

        // Filter users younger than 27
        // Map to full names
        // Sort by last name
        // Collect into  list

        List<String> resultList = users.stream()
                .filter(user -> user.getAge() < 27)
                .map(user -> user.getFirstName() + " " + user.getLastName())
                .sorted()
                .toList();

        System.out.println(resultList + " are younger than 27");
    }
}
