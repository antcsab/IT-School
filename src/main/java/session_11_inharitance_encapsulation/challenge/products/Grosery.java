package session_11_inharitance_encapsulation.challenge.products;

import java.time.LocalDate;

public class Grosery extends ProductName  {

    private LocalDate valability;
    private boolean coldOrNot;

    public LocalDate getValability() {
        return valability;
    }

    public void setValability(LocalDate valability) {
        this.valability = valability;
    }

    public boolean isColdOrNot() {
        return coldOrNot;
    }

    public void setColdOrNot(boolean coldOrNot) {
        this.coldOrNot = coldOrNot;
    }
}
