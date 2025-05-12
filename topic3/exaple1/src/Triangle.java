import interfaces.Shape;

public class Triangle implements Shape{

    private String color;
    private Integer base;
    private Integer height;
    private String name;
    public Triangle(Integer base, Integer height, String color) {
        this.base = base;
        this.height = height;
        this.color = color;
        this.name = "triangulo";
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double area() {
        Integer result =(this.base * this.height);
        return result.doubleValue();
    }

    @Override
    public Double perimeter() {
        Double base = this.base.doubleValue();
        Double height = this.height.doubleValue();

        Double hipo = Math.sqrt(base * base + height * height);
        return hipo + height + base;
    }
    
}
