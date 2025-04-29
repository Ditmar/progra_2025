package shape;

public class Triangle extends Shape {
    private Double base;
    private Double height;

    public Triangle(Double base, Double height, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public Double area() {
        return this.height * this.base / 2;
    }

    @Override
    public void println() {
        System.out.println("Hi i am a Triangle");
    }

}
