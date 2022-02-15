package sectors.konstruktor.example2;

import java.util.Random;

public class Dice {
    int top;

    public Dice(){}

    public Dice(int top){
        this.top = top;
        roll();
    }

    public void roll(){
        Random random = new Random();
        top = random.nextInt(6) + 1;
    }

    public void printInfo(){
        System.out.println("Liczba oczek na kostce: " + top);
    }
}
