import java.awt.*;

public class Assignment10_Main {
    public static void main(String[] args) {
        Block1 b = new Block1(10, 10);
        Rectangle r = new Rectangle(new Point(10, 10));
        Rectangle r2 = new Rectangle(new Point(20, 20), new Point(70, 70));

        // Rectangle r
        System.out.println("r");
        System.out.println(r);

        // Rectangle r2
        System.out.println("r2");
        System.out.println(r2);

        // Block1
        System.out.println("b");
        System.out.println(b);
        b.translate(10, -10);
        System.out.println("b translate(10, -10)");
        System.out.println(b);

        Block2 b2 = new Block2(10, 10); // Using Block1(int x, int y) Constructor
        Block3 b3 = new Block3(new Point(10, 10)); // Using Block1(Point p) Constructor

        // Block2
        System.out.println("b2");
        System.out.println(b2);
        b2.translate(10, -10);
        System.out.println("b2 translate(10, -10)");
        System.out.println(b2);

        // Block3
        System.out.println("b3");
        System.out.println(b3);
        b3.translate(10, -10);
        System.out.println("b3 translate(10, -10)");
        System.out.println(b3);
    }
}
