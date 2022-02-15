package sectors.agregacjakompozycja.example1;

public class Bank {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", "23434");
        BankAccount acc1 = new BankAccount(10_000);
        acc1.owner = person1;
        Credit credit1 = new Credit(2_000, 0, 0.05, 12);
        credit1.borrower = person1;
        Address livAddress1 = new Address("Warszawa", "Kwietniowa", 12, 25, "00-000");
        Address regAddress1 = new Address("Warszawa", "Kwietniowa", 12, 25, "00-000");
        person1.livingAddress = livAddress1;
        person1.registeredAddress = regAddress1;

        Person person2 = new Person("Maria", "Kowalska", "24567");
        BankAccount acc2 = new BankAccount(5_000);
        acc2.owner = person2;
        Credit credit2 = new Credit(1_000, 0, 0.05, 12);
        credit2.borrower = person2;
        Address livAddress2 = new Address("Warszawa", "Kwietniowa", 12, 25, "00-000");
        Address regAddress2 = new Address("Płock", "Malinowa", 32, 12, "01-000");
        person2.livingAddress = livAddress2;
        person2.registeredAddress = regAddress2;

        System.out.println("Osoba 1: ");
        System.out.println(person1.firstName + " " + person1.lastName);
        System.out.println("Mieszka w miejscowości: " + person1.registeredAddress.city);
        System.out.println("Posiada konto bankowe z kwotą: " + acc1.balance);

        System.out.println("Osoba 2: ");
        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.println("Mieszka w miejscowości: " + person2.registeredAddress.city);
        System.out.println("Posiada konto bankowe z kwotą: " + acc2.balance);

    }
}
