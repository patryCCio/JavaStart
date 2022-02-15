package sectors.dziedziczenie.example4;

public class Apple extends Fruit {
    String variety;

    public Apple(int weight, String type, String variety){
        super(weight, type);
    }

    public Apple(int weight, String variety) {
        super(weight);
        setType("Jabłkowate");
        this.variety = variety;
    }


    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + variety;
    }
}
