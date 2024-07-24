package session_15_recapOOP.practice.inharitance;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 2, "dog", "labrador", Size.MEDIUM);
        dog.bark();;
        dog.fetch();
    }
}
