package sectors.polimorfizm.example1;

public class Nurse extends Person {
    int overtime;

    public Nurse(String firstName, String lastName, double salary, int overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", Nadgodziny: " + overtime;
    }
}
