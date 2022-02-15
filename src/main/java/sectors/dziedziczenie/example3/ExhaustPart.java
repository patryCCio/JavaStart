package sectors.dziedziczenie.example3;

public class ExhaustPart extends Part{
    public boolean europeanStandard;

    public ExhaustPart(int serialNumber, String producer, String model, String series, boolean europeanStandard){
        setSerialNumber(serialNumber);
        setProducer(producer);
        setModel(model);
        setSeries(series);
        this.europeanStandard = europeanStandard;
    }

    void printInfo(){
        System.out.println(getSerialNumber() + ", " + getProducer() + ", " + getModel() + ", " + getSeries()
                + ", " + europeanStandard);
    }

}
