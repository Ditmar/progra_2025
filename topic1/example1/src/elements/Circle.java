package elements;

public class Circle {
    private Integer radio;
    private String color;

    public Circle(Integer radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public void print() {
        System.out.println("radio = " + this.radio);
        System.out.println("Color = " + this.color);
    }
}
