package session_11_inharitance_encapsulation.challenge.challenge11_6.multilevelinheritance;

public class ElectricCar extends Car {
    private int batteryCapacity = 7;
    private int range = 565;

    public void charge() {
        batteryCapacity++;
        range = range + 100;
    }
}
