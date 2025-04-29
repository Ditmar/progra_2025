package geometry;

public class Points {
    private Double x, y;

    public Points(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("[" + this.x + "," + this.y + "]");
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

}
