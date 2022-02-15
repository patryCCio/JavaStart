package sectors.polimorfizm.example2;

public class Zoo {
    public static void main(String[] args) {
        ZooInfo zoo = new ZooInfo();
        zoo.add(new Dog("Burek"));
        zoo.add(new Cat("Mruczek"));
        zoo.add(new Lion("Max"));
        zoo.add(new Lion("Max"));
        zoo.add(new Lion("Max"));
        zoo.add(new Lion("Max"));
        zoo.add(new Lion("Max"));
        zoo.add(new Lion("Max"));
        zoo.add(new Lion("Max"));
        zoo.add(new Lion("Max"));
        zoo.add(new Dog("Burek"));

        System.out.println(zoo.getInfo());
    }
}
