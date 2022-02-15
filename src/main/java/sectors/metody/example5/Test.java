package sectors.metody.example5;

public class Test {
    public static void main(String[] args) {
        Translate test1 = new Translate();
        double a = 121.43;
        System.out.println("Value " + a + " CM to M: " + test1.centymetersToMeters(a));
        System.out.println("Value " + a + " M to CM: " + test1.metersToCentymeters(a));
        System.out.println("Value " + a + " M to MM: " + test1.metersToMilimeters(a));

    }
}
