package sectors.metody.example1;

public class Calculate {
    public static void main(String[] args) {
        double var1 = 20;
        double var2 = 10;
        Calculator calc = new Calculator();

        System.out.println(calc.add(var1, var2));
        System.out.println(calc.substract(var1, var2));
        System.out.println(calc.multiply(var1, var2));
        System.out.println(calc.divide(var1, var2));
    }
}
