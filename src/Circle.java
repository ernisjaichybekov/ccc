public class Circle {


    private static final double PI = 3.1415;
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double area(double radius) {
        return PI * radius * radius;
    }


    public static double circumference(double radius) {
        return PI * 2 * radius;
    }

}
