package sectors.symulacjaladowania.patrickit.logic;

import sectors.symulacjaladowania.patrickit.model.Telephone;

public class Charger {
    public void charge(Telephone telephone){
        telephone.setChargeLevel(telephone.getChargeLevel()+1);
    }
}
