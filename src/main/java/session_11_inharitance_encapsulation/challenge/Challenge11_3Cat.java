package session_11_inharitance_encapsulation.challenge;

//Create a Cat class that extends Animal and overrides sound() method, and in this case, we want to print in
// our method “meow”

public class Challenge11_3Cat extends Challenge11_1Animal {
    @Override
    public void sound() {
        System.out.println("The cat is meowing!");
    }
}
