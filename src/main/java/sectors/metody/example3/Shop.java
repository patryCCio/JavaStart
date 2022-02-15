package sectors.metody.example3;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Czekolada mleczna", "Milka");
        Offer offer1 = new Offer(product1, 3.99, true);

        Product product2 = new Product("Krem balsamujący", "Nivea");
        Offer offer2 = new Offer(product2, 4.29, false);

        offer1.printInfo();
        offer2.printInfo();
    }
}
