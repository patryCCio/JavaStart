package sectors.dziedziczenie.example2.Animals;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor("White");
        Bird bird = new Bird();
        bird.setColor("Blue");

        System.out.println("Zwierzęta dają głos: ");
        System.out.print("Kot: ");
        cat.makeSound();
        System.out.println();

        System.out.print("Ptak: ");
        bird.makeSound();
        System.out.println();
    }
}
