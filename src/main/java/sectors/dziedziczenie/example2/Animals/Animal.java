package sectors.dziedziczenie.example2.Animals;

public class Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeSound(){
        System.out.println("Burp, burp");
    }
}
