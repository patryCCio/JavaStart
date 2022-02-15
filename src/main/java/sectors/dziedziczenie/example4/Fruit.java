package sectors.dziedziczenie.example4;

public class Fruit {
    int weight; //waga w gramach
    String type;

    public Fruit(int weight, String type) {
        super();
        this.weight = weight;
        this.type = type;
    }

    public Fruit(int weight){
        super();
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo(){
        return "Waga: " + weight + " / " + "Typ: " + type + " / " + "Odmiana: ";
    }
}
