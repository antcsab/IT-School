package session_19_JavaStream.practice;

import java.util.Arrays;
import java.util.List;

public class FilterAndMapUserExample {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("John", "Doe", 25),
                new User("Bob", "Smith", 28),
                new User("Alice", "Carter", 23)
        );

        // Filter users older than 26 and mao to their first name
        List<String> results = users.stream()
                .filter(user -> user.getAge() > 26)
                .map(User::getFirstName)
                .toList();

        System.out.println(results + " is older than 26");
    }
}
