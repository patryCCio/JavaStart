package sectors.polimorfizm.example2;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        setType("Pies");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + getType() + " - " + getName();
    }
}
