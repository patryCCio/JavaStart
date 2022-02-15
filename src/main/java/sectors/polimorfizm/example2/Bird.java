package sectors.polimorfizm.example2;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
        setType("Ptak");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + getType() + " - " + getName();
    }
}
