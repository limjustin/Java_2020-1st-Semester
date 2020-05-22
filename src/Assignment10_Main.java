import java.awt.*;

public class Assignment10_Main {
    public static void main(String[] args) {
        Block1 b = new Block1(10, 10);
        Rectangle r = new Rectangle(new Point(10, 10));
        Rectangle r2 = new Rectangle(new Point(20, 20), new Point(70, 70));

        System.out.println("r");
        System.out.println(r);
        System.out.println("r2");
        System.out.println(r2);

        System.out.println("b");
        System.out.println(b);
        b.translate(10, -10);
        System.out.println("b");
        System.out.println(b);
    }
}

// Block는 블록 하나 만드는 클래스
// Rectangle은 Block을 통해 테트리스 만드는 클래스
