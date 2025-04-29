import utils.OperationVector;
import utils.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        OperationVector operations = new OperationVector();
        System.out.println(operations.add(54, 34));
        showVector(operations.add(new Vector(45, 2), new Vector(23, -56)));
    }

    public static void showVector(Vector vector) {
        System.out.println("( " + vector.getA() + ", " + vector.getB() + ")");
    }
}
