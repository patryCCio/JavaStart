package sectors.klasywewnetrzne.example1;

public class CarTest {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.refuel(40);
        car.go();
    }
}