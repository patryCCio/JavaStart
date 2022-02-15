package sectors.polimorfizm.example1;

public class Hospital {
    private static final int maxEmployees = 3;
    private Person[] employees = new Person[3];
    private int employeesNumber = 0;

    void add(Person person){
        if(employeesNumber<maxEmployees){
            employees[employeesNumber] = person;
            employeesNumber++;
        }
        else{
            System.out.println("Brak miejsc dla pracowników!");
        }
    }

    String getInfo(){
        String result="";
        for(int i=0; i<employeesNumber; i++){
            result = result + employees[i].getInfo() + "\n";
        }
        return result;
    }
}
