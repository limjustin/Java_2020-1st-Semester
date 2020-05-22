import java.awt.*;

class Rectangle {

    // Make Variable
    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;
    Point upperLeft;
    Point lowerRight;

    // Constructor
    public Rectangle(Point uL) { // Rectangle Constructor가 좀 어려웠다...
        // 새로운 Point 변수 선언? Point 형식이 아니게 해야하는데
        // Point 변수를 선언할게 아니라, 새로운 Point 객체를 선언했어야 했음. (포인트 변수와 포인트 객체의 차이 알아보기!!)
//        Point new_lR = new Point((int) uL.getX(), (int) uL.getY()); // 개어려웠음 ㅜㅜ
        Point new_lR = new Point(uL);
        new_lR.translate(WIDTH, HEIGHT);
        this.upperLeft = uL;
        this.lowerRight = new_lR;
//        translate(WIDTH, HEIGHT); // lowerRight만 따로 설정해주라는 뜻인가??
    }

    public Rectangle(Point uL, Point lR) {
        this.upperLeft = uL;
        this.lowerRight = lR;
    }

    public void translate(int x, int y) {
        upperLeft.translate(x, y); // x, y 만큼 translate함
        lowerRight.translate(x, y);
    }

    Point getPoint(Point p) {
        return p;
    }

    public String toString() {
        String s;
        s = "UL: " + getPoint(upperLeft) + ", LR: " + getPoint(lowerRight); // 이렇게 합치면 알아서 문자열화 되는 건가?
        return s;
    }

}
