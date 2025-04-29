import java.util.ArrayList;

import shape.Circle;
import shape.Shape;
import shape.Square;
import shape.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        // Abstraccion
        // encapsulacion
        // Herencia
        // Polimorfismo

        Circle circle = new Circle(10.0, "red");
        Square square = new Square(14.0, "green");
        Triangle triangle = new Triangle(23.3, 34.32, "pink");

        ArrayList<Shape> list = new ArrayList();
        list.add(circle);
        list.add(square);
        list.add(triangle);

        for (Shape item : list) {
            item.println();
            System.out.println("area: " + item.area());
        }

    }
}
