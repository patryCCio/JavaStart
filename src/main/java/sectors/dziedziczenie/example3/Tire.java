package sectors.dziedziczenie.example3;

public class Tire extends Part {
    public int size;
    public double width;

    public Tire(int serialNumber, String producer, String model, String series, int size, double width){
        setSerialNumber(serialNumber);
        setProducer(producer);
        setModel(model);
        setSeries(series);
        this.size = size;
        this.width = width;
    }

    void printInfo(){
        System.out.println(getSerialNumber() + ", " + getProducer() + ", " + getModel() + ", " + getSeries()
        + ", " + size + ", " + width);
    }
}
