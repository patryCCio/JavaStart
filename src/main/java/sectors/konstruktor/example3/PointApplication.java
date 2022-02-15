package sectors.konstruktor.example3;

public class PointApplication {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        Point point = new Point(x, y);
        PointController pointC = new PointController();

        pointC.addX(point);
        pointC.addX(point);
        pointC.addX(point);
        pointC.minusX(point);
        pointC.addY(point);
        pointC.addY(point);
        pointC.addY(point);
        pointC.minusY(point);
        pointC.minusY(point);
        System.out.println(point.getX()+","+ point.getY());


    }

}
