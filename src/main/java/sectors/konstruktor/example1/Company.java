package sectors.konstruktor.example1;

public class Company {
    public static void main(String[] args) {
        Employee employer1 = new Employee("Jan", "Kowaslki", "13.04.1968");
        System.out.println(employer1.printInfo());

        Employee employer2 = new Employee("Mateusz", "Jędrzejewski", "29.01.1995");
        System.out.println(employer2.printInfo());

        Employee employer3 = new Employee("Patryk", "Szczerbiński", "08.03.2000");
        System.out.println(employer3.printInfo());




    }
}
