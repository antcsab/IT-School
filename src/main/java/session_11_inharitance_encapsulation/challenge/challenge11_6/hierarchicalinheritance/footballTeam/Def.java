package session_11_inharitance_encapsulation.challenge.challenge11_6.hierarchicalinheritance.footballTeam;

public class Def extends Player {

    private int strength = 92;
    private int drible = 33;

    public void tacklingPersantage() {
        int tacklingPersantage = 75;
        System.out.println("The defender tackle %: " + tacklingPersantage);
    }
}
