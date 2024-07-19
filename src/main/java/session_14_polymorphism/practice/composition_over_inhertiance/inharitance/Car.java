package session_14_polymorphism.practice.composition_over_inhertiance.inharitance;

public class Car extends Engine {


    @Override
    void start() {
        System.out.println("Car is moving");
    }
}
