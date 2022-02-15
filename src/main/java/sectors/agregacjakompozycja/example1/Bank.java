package sectors.agregacjakompozycja.example1;

public class Bank {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Patryk";
        person1.lastName = "Szczerbiński";
        person1.pesel = "12345678910";

        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 5000;
        credit1.cashReturned = 0;
        credit1.interestRate = 0.1;
        credit1.termMonths = 12;

        System.out.println("Osoba:");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę " + credit1.cashBorrowed);
    }
}
