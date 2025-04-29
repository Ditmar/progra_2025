package geometry;

public class Points3d extends Points {
    private Double z;

    public Points3d(Double x, Double y, Double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void print() {
        System.out.println("[" + this.getX() + " ," + this.getY() + " ," + this.z + "]");
    }

}
