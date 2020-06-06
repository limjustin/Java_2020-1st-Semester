public class RectangleClass extends Shape {
    private Point p1;
    private Point p2;

    public RectangleClass(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public RectangleClass(int x1, int y1, int x2, int y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }
    public double getArea() {
        return Math.abs((p2.getX() - p1.getX()) * (p2.getY() - p1.getY()));
    }
    public double getPerimeter() {
        return 2 * (p2.getX() - p1.getX()) + 2 * (p2.getY() - p1.getY());
    }
    public String toString() {
        return "Rectangle: " + "\n" +
                "p1: " + p1.toString() + "\n" +
                "p2: " + p2.toString();
    }

}
