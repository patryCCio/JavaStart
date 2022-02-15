package sectors.polimorfizm.example3;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore comp = new DataStore();
        comp.add(new Computer("HP", 2100));
        comp.add(new Computer("HP", 2100));
        comp.add(new Computer("ASUS", 2103));
        comp.add(new Computer("ASUS", 2010));
        comp.add(new Computer("ASUS", 2103));
        comp.add(new Computer("HP", 2100));

        System.out.println(comp.checkAvailability());
        System.out.println(comp.toString());
    }
}
