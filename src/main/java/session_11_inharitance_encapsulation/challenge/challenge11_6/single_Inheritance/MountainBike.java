package session_11_inharitance_encapsulation.challenge.challenge11_6.single_Inheritance;

public class MountainBike extends Bicycle {
    private String tireType;
    private String suspension;

    public void adjustSuspension(){
        suspension = "Soft";
    }

    public String getTireType() {
        return tireType;
    }

    public String getSuspension() {
        return suspension;
    }

    public void tire(){
        tireType = "For summer";
    }
}
