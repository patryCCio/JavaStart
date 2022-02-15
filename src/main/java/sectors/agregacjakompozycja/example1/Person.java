package sectors.agregacjakompozycja.example1;

public class Person {
    String firstName;
    String lastName;
    String pesel;
    Address livingAddress;
    Address registeredAddress;


    public Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }
}
