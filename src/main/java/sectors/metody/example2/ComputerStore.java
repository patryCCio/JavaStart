package sectors.metody.example2;

public class ComputerStore {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        ComputerFactory factory = new ComputerFactory();
        comp1.processor = "Intel i5";
        comp1.memory = 8192;

        Computer comp2 = factory.create("AMD Ryzen 7 4800H", 16384);
        Computer comp3 = factory.create("AMD Ryzen 7 4800HQ", 8192);
        comp1.printInfo();
        comp2.printInfo();
        comp3.printInfo();

    }
}
