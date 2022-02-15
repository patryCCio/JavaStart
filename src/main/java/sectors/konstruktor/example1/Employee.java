package sectors.konstruktor.example1;

public class Employee {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    public static int idNumber=0;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        idNumber++;
    }

    public String getFirstName() {
        return firstName;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String printInfo(){
        return "Imię i nazwisko: " + firstName + " " + lastName +
                "\nData urodzenia: " + dateOfBirth + "\n" + "ID: " + idNumber + "\n";
    }
}
