package sectors.polimorfizm.example2;

public class ZooInfo {
    private final static int MAX_ANIMALS = 10;
    private static int howManyAnimals = 0;

    Animal[] animals = new Animal[MAX_ANIMALS];

    public void add(Animal animal){
        if(howManyAnimals<MAX_ANIMALS){
            animals[howManyAnimals] = animal;
            howManyAnimals++;
        }else System.out.println("Nie można dodać zwierzęcia do ZOO!");
    }

    public String getInfo(){
        String result="";
        for(int x=0; x<howManyAnimals; x++){
            result = result + animals[x].getInfo() + "\n";
        }
        return result;
    }
}
