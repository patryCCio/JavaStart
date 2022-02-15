package sectors.polimorfizm.example2;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        setType("Kot");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + getType() + " - " + getName();
    }
}
