package session_15_recapOOP.practice.inharitance;

public class Test2 {
    public static void main(String[] args) {
        Animal dog = new Dog("Rex2", 3, "dog","labrador",Size.MEDIUM);

        Dog dog2 = (Dog) dog;
        dog2.fetch();
        dog2.bark();
    }
}
