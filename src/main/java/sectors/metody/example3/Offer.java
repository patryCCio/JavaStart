package sectors.metody.example3;

public class Offer {
    Product product;
    double price;
    boolean special;

    public Offer(Product product, double price, boolean special) {
        this.product = product;
        this.price = price;
        this.special = special;
    }

    public void printInfo(){
        System.out.println("Produkt: " + product.name);
        System.out.println("Producent: " + product.producer);
        System.out.println("Cena: " + price + " zł");
        System.out.println("Special offer: " + special + "\n");
    }
}
