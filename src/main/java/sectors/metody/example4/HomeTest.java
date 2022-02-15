package sectors.metody.example4;

public class HomeTest {
    public static void main(String[] args) {
        Home home = new Home(10_000, 1000);
        System.out.println(home.getStatus());
        System.out.println("Bierzemy prysznic");
        home.takeShower();;
        System.out.println(home.getStatus());
        System.out.println("TV 4h");
        home.watchTv(4);
        System.out.println(home.getStatus());
        System.out.println("Obiad");
        home.makeDinner();
        System.out.println(home.getStatus());
    }
}
