package session_11_inharitance_encapsulation.challenge.products;

public class Main {
    public static void main(String[] args) {

        Fruit apple = new Fruit();
        apple.setOrigin("Tokyo");
        System.out.println(apple.getOrigin());

        Fruit pear = new Fruit();
        pear.setOrigin("Bangladesh ");
        System.out.println(pear.getOrigin());

        Dearie hochlandChees = new Dearie();
        hochlandChees.getValability();

        Dearie milkNapolact = new Dearie();
        milkNapolact.getValability();

        Drink cola = new Drink();
        cola.isColdOrNot();

        Drink pepsi = new Drink();
        pepsi.isAlcoolOrNot();

        Drink ursus = new Drink();
        ursus.isAlcoolOrNot();

        Item chair = new Item();
        chair.getSerialNumber();

        Item table = new Item();
        table.getProductNumber();

        System.out.println("The numbers of pears before selling: " + pear.productNumber);
        pear.sell(7);
        System.out.println("The numbers of pears after selling: " + pear.productNumber);
    }
}

