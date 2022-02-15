package sectors.interfejs.example1;

class Triangle implements Shape{

    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calculateArea(){
        return a*h/2;
    }
    public double calculatePerimeter(){
        return a + b + c;
    }
}
