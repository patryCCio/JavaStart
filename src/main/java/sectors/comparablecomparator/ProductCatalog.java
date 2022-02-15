package sectors.comparablecomparator;

import java.util.Arrays;

public class ProductCatalog {
    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new Product("Amino", "Zupa pomidorowa", 3.9);
        products[1] = new Product("Amino", "Zupa ogórkowa", 3.9);
        products[2] = new Product("WINIARY", "Zupa pomidorowa", 4.2);
        products[3] = new Product("WINIARY", "Zupa pieczarkowa", 4.1);
        products[4] = new Product("WINIARY", "Rosół", 3.6);
        products[5] = new Product("Knorr", "Placki ziemniaczane", 6.4);
        products[6] = new Product("Knorr", "Racuchy", 7.2);

        System.out.println("Nieposortowana: ");
        for(Product p:products){
            System.out.println(p);
        }

        Arrays.sort(products);
        System.out.println("Posortowana: ");
        for(Product p:products){
            System.out.println(p);
        }
    }
}
