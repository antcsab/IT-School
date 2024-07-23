package session_11_inharitance_encapsulation.challenge;

//Create a Wolf class that extends Animal, and overrides sound() method, and print “how”

public class Challenge11_4Wolf extends Challenge11_1Animal {
    @Override
    public void sound() {
        System.out.println("Howl");
    }
}
