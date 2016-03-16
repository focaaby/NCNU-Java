public class Trapezoid extends Shape2D {
    private double up, down, height;
    public Trapezoid(double u, double d, double h) {
        up = u;
        down = d;
        height = h;
    }
    // override area defined in Shape2D
    public double area() {
        return (up + down) * height / 2;
    }

}
