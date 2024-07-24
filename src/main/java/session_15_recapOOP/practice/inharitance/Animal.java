package session_15_recapOOP.practice.inharitance;
//Create a class Animal with attributes such as name, age, and species. Create a subclass Dog that inherits from the
// Animal class, and add attributes such as breed and size. Implement methods such as bark() and fetch() in the Dog
// class that use the attributes inherited from the Animal class.

public class Animal {

    String name;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    int age;
    String species;
}
