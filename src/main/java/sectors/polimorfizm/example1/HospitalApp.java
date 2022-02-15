package sectors.polimorfizm.example1;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hosp = new Hospital();
        hosp.add(new Doctor("Maciek", "Prefeska", 7500, 1300));
        hosp.add(new Nurse("Agata", "Voodoo", 3500, 40));
        hosp.add(new Nurse("Bogusława", "Kowalska", 4000, 43));

        System.out.println("Pracownicy szpitala: ");
        System.out.println(hosp.getInfo());

    }
}
