package sectors.dziedziczenie.example3;

public class MotoShop {
    public static void main(String[] args) {
        Tire tire = new Tire(123, "SuperTire", "ContactPRO", "Winter pro", 17, 225);
        tire.printInfo();
        ExhaustPart exhaust1 = new ExhaustPart(987, "Noisy Parts", "Turbo brum", "Noisy Exhaust", true);
        exhaust1.printInfo();
    }
}
