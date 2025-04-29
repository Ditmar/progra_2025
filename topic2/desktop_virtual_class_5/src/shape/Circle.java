package shape;

public class Circle extends Shape {
    private Double radio;

    public Circle(Double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public Double area() {
        return Math.PI * this.radio * this.radio;
    }

    @Override
    public void println() {
        System.out.println("Hi i am a circle");
    }

}