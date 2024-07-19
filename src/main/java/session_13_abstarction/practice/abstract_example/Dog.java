package session_13_abstarction.practice.abstract_example;

import session_13_abstarction.practice.interface_example.Pet;

public class Dog extends Animal implements Pet {

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void poop() {
        System.out.println("This dog is pooping");
    }
}
