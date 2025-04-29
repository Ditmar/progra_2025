import geometry.Points;
import geometry.Points3d;

public class App {
    public static void main(String[] args) throws Exception {
        Points point2d = new Points(45.4, 56.0);
        point2d.print();
        Points3d point = new Points3d(0.0, 10.0, 5.0);
        point.print();
    }
}
