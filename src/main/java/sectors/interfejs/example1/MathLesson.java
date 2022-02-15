package sectors.interfejs.example1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathLesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chase=0;
        double resultArea = 0;
        double resultPerimeter = 0;
        double a, b, c, r , h;

        try{
            System.out.println("Jaki kształt wyliczyć: ");
            System.out.println("1. Koło");
            System.out.println("2. Prostokąt");
            System.out.println("3. Trójkąt");
            System.out.print("Wybór: ");
            chase = sc.nextInt();
            sc.nextLine();

            switch(chase){
                case 1:
                    System.out.print("Podaj promień: ");
                    r = sc.nextDouble();
                    sc.nextLine();
                    Circle circ = new Circle(r);
                    resultArea = circ.calculateArea();
                    resultPerimeter = circ.calculatePerimeter();
                    break;
                case 2:
                    System.out.print("Podaj bok a: ");
                    a = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Podaj bok b: ");
                    b = sc.nextDouble();
                    sc.nextLine();
                    Rectangle rec = new Rectangle(a, b);
                    resultArea = rec.calculateArea();
                    resultPerimeter = rec.calculatePerimeter();
                    break;
                case 3:
                    System.out.print("Podaj podstawę: ");
                    a = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Podaj wysokość: ");
                    h = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Podaj pierwsze ramię: ");
                    b = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Podaj drugie ramię: ");
                    c = sc.nextDouble();
                    sc.nextLine();
                    if(a>=(b+c))throw new InputMismatchException("Za krótkie ramiona, nie można utworzyć trójkąta!");


                    Triangle tria = new Triangle(a, b, c, h);
                    resultArea = tria.calculateArea();
                    resultPerimeter = tria.calculatePerimeter();
                    break;
                default:
                    throw new ArrayIndexOutOfBoundsException("Nie ma takiego wyboru!");
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.err.println(ex.getMessage());
        }catch(InputMismatchException ex){
            System.err.println("Podano zły parametr!");
            System.err.println(ex.getMessage());
        }
        System.out.println("Pole powierzchni: " + resultArea + " [j^2]");
        System.out.println("Obwód: " + resultPerimeter + " [j]");
    }
}
