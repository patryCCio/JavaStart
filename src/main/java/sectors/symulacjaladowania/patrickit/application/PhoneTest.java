package sectors.symulacjaladowania.patrickit.application;

import sectors.symulacjaladowania.patrickit.logic.Charger;
import sectors.symulacjaladowania.patrickit.model.Telephone;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone.getInfo());
        Charger charger = new Charger();
        charger.charge(telephone);
        System.out.println(telephone.getInfo());
        charger.charge(telephone);
        System.out.println(telephone.getInfo());
        charger.charge(telephone);
        System.out.println(telephone.getInfo());
        charger.charge(telephone);
        charger.charge(telephone);
        System.out.println(telephone.getInfo());
    }
}
