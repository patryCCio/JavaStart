package sectors.agregacjakompozycja.example1;

public class Credit {
    Person borrower;
    double cashBorrowed;
    double cashReturned;
    double interestRate;
    int termMonths;

    public Credit(double cashBorrowed, double cashReturned, double interestRate, int termMonths) {
        this.cashBorrowed = cashBorrowed;
        this.cashReturned = cashReturned;
        this.interestRate = interestRate;
        this.termMonths = termMonths;
    }
}
