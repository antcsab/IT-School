package session_15_recapOOP.practice.abstraction;

public class Car implements Vehicle{
    public Car() {
        super();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");

    }
}
