package session_14_polymorphism.practice.composition_over_inhertiance.composition;

public class Car {
    //Has- A Car - Engine
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
    }
}
