package session_11_inharitance_encapsulation.practice;

public class Appliance {

    String brand = "Generic";

    Appliance() {
        System.out.println("Appliance is created");
    }

    void function() {
        System.out.println("Appliance is functioning");
    }
}

class Refrigeratpr extends Appliance {

    String brand = "Arctic";

    Refrigeratpr() {
        super();//calls the constructor of the parent class
        System.out.println("Refrigerator is created");
    }

    void displayBrand() {
        System.out.println("Refrigerator brand: " + brand);
        System.out.println("Appliance brand: " + super.brand);
    }

    void function() {
        System.out.println("Refrigerator is cooling");
    }

    void work() {
        super.function(); //calls function from Appliance
        function();
    }
}

class TestRefrigerator {
    public static void main(String[] args) {
        Refrigeratpr refrigeratpr = new Refrigeratpr();
        refrigeratpr.displayBrand();
        refrigeratpr.work();
    }
}