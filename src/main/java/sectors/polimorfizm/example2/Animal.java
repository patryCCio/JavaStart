package sectors.polimorfizm.example2;

public class Animal {
    private String name;
    private String type;

    public Animal(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo(){
        return "Jestem ";
    }
}
