package session_10_OOP_concepts.practice.static_keyword;

public class Validator {

    public static boolean isValidUser(User user) {
        return user.getAge() > 18;
    }
}
