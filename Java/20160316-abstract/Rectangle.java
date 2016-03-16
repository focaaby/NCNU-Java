public class Rectangle extends Shape2D {
    private double width, height;
    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    // override area defined in Shape2D
    public double area() {
        return width * height;
    }

}
