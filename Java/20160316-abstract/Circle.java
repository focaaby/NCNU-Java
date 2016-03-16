public class Circle extends Shape2D {
    private double radius;
    private static final double PI = 3.1416926254;
    public Circle(double r) {
        radius = r;
    }
    // override area defined in Shape2D
    public double area() {
        return PI * radius * radius;
    }

}
