package session_19_JavaStream.challenge;

public class PersonCh5 {

    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public PersonCh5(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
