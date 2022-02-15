package sectors.metody.example4;

public class Home {
    double water;
    double fuel;

    public Home(double water, double fuel) {
        this.water = water;
        this.fuel = fuel;
    }

    String getStatus(){
        return "Ilość wody: " + water + " litrów, ropa: " + fuel + " litrów.";
    }

    public void takeShower() {
        water -= 48;
    }

    public void takeBath() {
        water -= 86;
    }

    public void makeDinner() {
        water -= 4;
        fuel -= 0.1;
    }

    public void boilWater() {
        water -= 0.5;
        fuel -= 0.05;
    }

    public void watchTv(int hours) {
        double fuelConsumption = hours * 0.06;
        fuel -= fuelConsumption;
    }
}
