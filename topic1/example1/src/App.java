import elements.Circle;
import elements.Table;

public class App {
    public static void main(String[] args) throws Exception {
        Table table = new Table(200, 100, "Cafe");
        table.print();
        Circle circle = new Circle(100, "verde");
    }
}
