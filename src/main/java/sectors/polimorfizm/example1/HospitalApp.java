package sectors.polimorfizm.example1;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Maciek", "Krzywousty", 6_000, 2_000));

        System.out.println("Pracownicy szpitala: ");
        System.out.println(hospital.getInfo());
    }
}
