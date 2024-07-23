package session_11_inharitance_encapsulation.challenge.challenge11_6.multilevelinheritance;

public class Main11_6multilevelinheritance {

    public static void main(String[] args) {
        Car cars = new Car();
        cars.accelerate();

        Car electricCar = new ElectricCar();
        electricCar.start();

        Car tesla = new Tesla();
        tesla.stop();
    }
}
