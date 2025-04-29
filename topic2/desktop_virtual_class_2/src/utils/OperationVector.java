package utils;

public class OperationVector extends Operation {

    public Vector add(Vector a, Vector b) {
        return new Vector(a.getA() + b.getA(), a.getB() + b.getB());
    }

    public Vector subtract(Vector a, Vector b) {
        return new Vector(a.getA() - b.getA(), a.getB() - b.getB());
    }

    public Vector multiply(Integer r, Vector b) {
        return new Vector(r * b.getA(), r * b.getB());
    }

    public Vector division(Integer r, Vector b) {
        return new Vector(b.getA() / r, b.getB() / r);
    }
}