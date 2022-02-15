package sectors.dziedziczenie.example1;

public class Car extends WheeledVehicle {
    private int doors;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    void printInfo(){
        System.out.println("Samochód: silnik: " + getEngine().getType() + ", koła: " + getWheels());
    }
}
