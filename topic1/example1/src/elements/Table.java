package elements;

/* 
 * typos de datos
 * int, char, double, float
 * Integer, String, Double
 */
public class Table {
    Integer width;
    Integer height;
    String color;

    public Table(Integer width, Integer height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void print() {
        Circle circle = new Circle(100, "rojo");
        System.out.println("Ancho = " + this.width);
        System.out.println("Alto = " + this.height);
        System.out.println("Color = " + this.color);
    }
}
