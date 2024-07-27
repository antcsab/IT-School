package session_11_inharitance_encapsulation.challenge.products;

public class ProductName {

    public int serialNumber = 23214;
    public int productNumber = 325;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public void sell(int number) {
        productNumber = productNumber - number;
    }
}
