package session_11_inharitance_encapsulation.challenge;


public class Main11 {
    public static void main(String[] args) {

        Challenge11_1Animal animal = new Challenge11_1Animal();
        animal.sound();

        Challenge11_2Dog dog = new Challenge11_2Dog();
        dog.sound();

        Challenge11_3Cat cat = new Challenge11_3Cat();
        cat.sound();

        Challenge11_4Wolf wolf = new Challenge11_4Wolf();
        wolf.sound();
    }
}
