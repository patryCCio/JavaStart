package sectors.polimorfizm.example1;

public class Nurse extends Person {
    private int overtime;

    public Nurse(String name, String lastName, int salary, int overtime) {
        super(name, lastName, salary);
        this.overtime = overtime;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " / Ilość nadgodzin: " + overtime;
    }
}
