package session_11_inharitance_encapsulation.challenge.challenge11_6.hierarchicalinheritance.footballTeam;

public class Player {

    public void foot() {
        System.out.println("Left foot");
    }

    public static void main(String[] args) {

        Gk gk = new Gk();
        gk.Reflex();
        gk.foot();

        Def def = new Def();
        def.tacklingPersantage();

        Att att = new Att();
        att.setTotalShots();

        Mid mid = new Mid();
        mid.accouratePass();
        mid.pass();
    }
}
