package session_11_inharitance_encapsulation.challenge.challenge11_6.hierarchicalinheritance.footballTeam;

public class Att extends Player {

    private int totalShots = 24;
    private int power = 90;

    public void setTotalShots() {
        System.out.println("The attacker total shots " + totalShots);
    }
}
