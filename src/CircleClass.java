public class CircleClass extends Shape {
    private Point center;
    private int radius;

    public CircleClass(Point p, int r) {
        this.center = p;
        radius = r;
    }
    public CircleClass(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }
    public double getArea() {
        return Math.abs(radius*radius*3.141592);
    }
    public double getPerimeter() {
        return 2*3.141592*radius;
    }
    public String toString() {
        return "Circle: " + "\n" +
                "center: " + center.toString() + "\n" +
                "radius: " + radius;
    }
}
