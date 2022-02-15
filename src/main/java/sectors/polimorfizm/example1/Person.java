package sectors.polimorfizm.example1;

public class Person {
    private String name;
    private String lastName;
    private int salary;

    public Person(String name, String lastName, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getInfo(){
        return "Imię i nazwisko: " + name + " " + lastName + " / wypłata: " + salary;
    }
}
