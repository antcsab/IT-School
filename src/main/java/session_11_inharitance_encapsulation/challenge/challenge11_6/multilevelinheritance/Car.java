package session_11_inharitance_encapsulation.challenge.challenge11_6.multilevelinheritance;

public class Car {

    private int make = 156;
    private String model = "Coupe";
    private int year = 1968;
    private int speed;

    public int getMake() {
        return make;
    }

    public void stop() {
        speed = 0;
    }

    public void start() {
        speed = 1;
    }

    public int accelerate() {
        return speed++;
    }
}
