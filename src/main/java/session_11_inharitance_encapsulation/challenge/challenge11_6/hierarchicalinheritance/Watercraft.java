package session_11_inharitance_encapsulation.challenge.challenge11_6.hierarchicalinheritance;

public class Watercraft {

    public static void main(String[] args) {

        Boat boat = new Boat();
        boat.sail();

        FishingBoat fishingBoat = new FishingBoat();
        fishingBoat.castNet();
        fishingBoat.sail();

        SpeedBoat speedBoat = new SpeedBoat();
        speedBoat.turboBoost();
        speedBoat.sail();
    }
}
