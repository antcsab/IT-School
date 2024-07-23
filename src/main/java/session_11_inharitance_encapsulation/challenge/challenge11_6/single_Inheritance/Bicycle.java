package session_11_inharitance_encapsulation.challenge.challenge11_6.single_Inheritance;

public class Bicycle {
    private int speed = 10;
    private int gear = 1;

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void changeGear() {
        gear++;
    }

    public void speedUp() {
        speed++;
    }

    public void applyBrake() {
        speed--;
    }


}
