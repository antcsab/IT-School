package session_11_inharitance_encapsulation.challenge.products;

public class Item extends ProductName {

    private String provenience = "Cuba";
    private int chair = 4;
    private int table = 2;

    public String getProvenience() {
        return provenience;
    }

    public void setProvenience(String provenience) {
        this.provenience = provenience;
    }
}
