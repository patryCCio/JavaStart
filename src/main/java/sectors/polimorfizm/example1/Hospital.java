package sectors.polimorfizm.example1;

public class Hospital {
    private static final int MAX_EMPLOYEES = 3;

    private Person[] tab = new Person[MAX_EMPLOYEES];

    private int employeesNumber = 0;

    public void add(Person person){
        if(employeesNumber<MAX_EMPLOYEES){
            tab[employeesNumber] = person;
            employeesNumber++;
        }else System.out.println("Nie można dodać nowego pracownika!");
    }

    String getInfo(){
        String result = "";
        for(int i=0; i<employeesNumber; i++){
            result = result + tab[i].getInfo() + "\n";
        }
        return result;
    }
}
