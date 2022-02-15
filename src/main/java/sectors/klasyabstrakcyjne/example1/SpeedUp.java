package sectors.klasyabstrakcyjne.example1;

public class SpeedUp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle plane = new Plane();

        car.speedUp();
        plane.speedUp();

        System.out.println("V samochodu: " + car.getSpeed());
        System.out.println("V samolotu: " + plane.getSpeed());
    }
}
