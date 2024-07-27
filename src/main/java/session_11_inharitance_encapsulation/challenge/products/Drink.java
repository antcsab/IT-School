package session_11_inharitance_encapsulation.challenge.products;

public class Drink extends Grosery {

    private int cantitate = 2025;
    private boolean alcoolOrNot;

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public boolean isAlcoolOrNot() {
        return alcoolOrNot;
    }

    public void setAlcoolOrNot(boolean alcoolOrNot) {
        this.alcoolOrNot = alcoolOrNot;
    }
}
