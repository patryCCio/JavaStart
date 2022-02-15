package sectors.specyfikatorydostepu.example1.app;

import sectors.specyfikatorydostepu.example1.controller.PointController;
import sectors.specyfikatorydostepu.example1.data.Point;

import java.util.Scanner;

public class PointApplication {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        PointController pc = new PointController();

        final int exit=9;
        final int left=1;
        final int up=2;
        final int down=3;
        final int right=4;
        int option=-1;
        Scanner scan = new Scanner(System.in);

        do{

            System.out.println("Położenie punktu: (" + p1.getX() + ";" + p1.getY() + ")");
            System.out.println(left + " lewo");
            System.out.println(up + " góra");
            System.out.println(down + " dół");
            System.out.println(right + " prawo");
            System.out.println(exit + " exit");
            System.out.print("Opcja: ");
            option=scan.nextInt();
            scan.nextLine();

            switch (option){
                case left: pc.minusX(p1); break;
                case up: pc.addY(p1); break;
                case down: pc.minusY(p1); break;
                case right: pc.addX(p1); break;
                case exit:
                    System.out.println("Zamykam program..."); break;
                default:
                    System.out.println("Nie ma takiego wyboru!"); break;
            }
        }while(option!=exit);

        scan.close();
    }

}
