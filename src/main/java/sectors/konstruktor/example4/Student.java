package sectors.konstruktor.example4;

public class Student {
    private String name;
    private String lastName;
    private static int studentNumber=0;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        newStudent();
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

    public void newStudent(){
        studentNumber++;
        System.out.println("Student " + studentNumber);
        System.out.println("Imię i nazwisko: " + getName() + " " + getLastName());
    }
}
