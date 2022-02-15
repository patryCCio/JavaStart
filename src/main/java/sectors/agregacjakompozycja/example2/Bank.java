package sectors.agregacjakompozycja.example2;

public class Bank {
    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Kowalski", "123");
        Addres address1 = new Addres();
        address1.addresPerson = person1;
        address1.regAddress = "Niewiadoma 13, Warszawa 01-312";
        address1.livAddress = "Niewiadoma 13, Warszawa 01-312";

        BankAccount account1 = new BankAccount();
        account1.balance = 10_000;

        Credit credit1 = new Credit();
        credit1.cashBorrowed = 5000;
        credit1.cashReturned = 2000;
        credit1.interestRate = 0.10;
        credit1.termMonths = 12;

        credit1.borrower = person1;
        account1.owner = person1;

        Person person2 = new Person("Weronika", "Kowalska", "124");
        Addres address2 = new Addres();
        BankAccount account2 = new BankAccount();
        Credit credit2 = new Credit();
        address2.addresPerson = person2;
        address2.regAddress = "Zabytkowa 14, Ciechocinek 06-324";
        address2.livAddress = "Niewiadoma 13, Warszawa 01-312";
        account2.owner = person2;
        account2.balance = 10_000;
        credit2.borrower = person2;
    }
}
