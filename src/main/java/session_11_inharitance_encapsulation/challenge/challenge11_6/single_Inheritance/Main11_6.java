package session_11_inharitance_encapsulation.challenge.challenge11_6.single_Inheritance;

public class Main11_6 {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();
        mountainBike.speedUp();
        System.out.println("Speed is: " + mountainBike.getSpeed());

        mountainBike.changeGear();
        System.out.println("Current gear is: " + mountainBike.getGear());


        mountainBike.applyBrake();
        System.out.println("Speed after brake: " + mountainBike.getSpeed());
    }
}
