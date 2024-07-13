package session_11_inharitance_encapsulation.practice;

public class Vehicle {

    private String brand;
    private int speed;


    public void accelerate() {
        speed += 10;
    }

    public void brake() {
        speed -= 10;
    }
}

class Car extends Vehicle {

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}

class Bike extends Vehicle {
    @Override
    public void accelerate() {
        super.accelerate();
    }
}
