package shape;

public class Square extends Shape {
    private Double edge;

    public Square(Double edge, String color) {
        super(color);
        this.edge = edge;
    }

    @Override
    public Double area() {
        return this.edge * this.edge;
    }

    @Override
    public void println() {
        System.out.println("Hi i am a Square");
    }

}