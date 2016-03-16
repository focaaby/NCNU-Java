public class Homework {
    public static  void main(String[] argv) {
        String s = "abcd";
        Shape2D[] x = new Shape2D[3];
        x[0] = new Rectangle(10, 20);
        x[1] = new Circle(5);
        x[2] = new Trapezoid(5, 8, 7);
        System.out.println(SumShape.sum(x));
        if (s.equals("abcd")) {
            System.out.print("...");
        }
    }
}
