package sectors.polimorfizm.example2;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
        setType("Lew");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + getType() + " - " + getName();
    }
}
