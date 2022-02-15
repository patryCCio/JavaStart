package sectors.polimorfizm.example3;

public class DataStore {

    private static final int MAX_NUMBER = 10;
    private int actualNumber = 0;
    private int actualNumber2 = 0;
    private int sameNotebooks = 1;

    Computer[] notebooks = new Computer[MAX_NUMBER];

    public void add(Computer notebook) {
        if (actualNumber < MAX_NUMBER) {
            notebooks[actualNumber] = notebook;
            actualNumber++;
        } else System.out.println("Nie można dodać egzemplarzu!");
    }

    public int checkAvailability() {
        Computer[] comp = new Computer[actualNumber];
        int z = 0;
        boolean isEqual = false;
        for (int x = 0; x < actualNumber; x++) {
            for (int j = z; j >= 0; j--) {
                if ((notebooks[j].equals(notebooks[z])) == true) {
                    x++;
                }
            }
            for (int y = x; y < actualNumber; y++) {
                if ((notebooks[x].equals(notebooks[y])) == true) {
                    sameNotebooks++;
                    isEqual = true;
                }

                comp[z] = notebooks[y];


            }
            if (isEqual == true) {
                z++;
                isEqual = false;
            }
        }
        return sameNotebooks;
    }

    @Override
    public String toString() {
        String result = "";
        for (int x = 0; x < actualNumber; x++) {
            result = result + notebooks[x].toString() + "\n";
        }
        return result;
    }

}
