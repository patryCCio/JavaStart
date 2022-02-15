package sectors.polimorfizm.example1;

public class Doctor extends Person {
    private int bonus;

    public Doctor(String name, String lastName, int salary, int bonus) {
        super(name, lastName, salary);
        this.bonus = bonus;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " / Premia: " + bonus;
    }
}
