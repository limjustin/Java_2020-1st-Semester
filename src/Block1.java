import java.awt.*;

class Block1 {

    Rectangle[] rectangles = new Rectangle[4];

    public Block1(Point p) {
        for(int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle(new Point((int) p.getX(), (int) p.getY()));
        }
        setBlock();
    }

    public Block1(int x, int y) { // Block1 객체 만들었을 때 호출되는 Constructor
        for(int i=0; i<rectangles.length; i++) {
            rectangles[i] = new Rectangle(new Point(x, y)); // Rectangle 객체 배열에 의한 새로운 Point 객체 선언
                                                            // 그래야 각 Point 만들 수 있음
        }
        setBlock();
    }

    public void setBlock() {
        rectangles[0].translate(0,0); // Rectangle Class에 있는 public void translate 함수를 사용함 + 블록의 형태 여기서 구성 가능
        rectangles[1].translate(Rectangle.WIDTH, 0);
        rectangles[2].translate(0,Rectangle.HEIGHT);
        rectangles[3].translate(Rectangle.WIDTH, Rectangle.HEIGHT);
    }

    public void translate(int x, int y) { // main에서 온 인자
        for(int i = 0; i < rectangles.length; i++) {
            rectangles[i].translate(x, y); // 각각의 블록 위치 상대적 이동
        }
    }

    public String toString() {
        String s = "";
        for(int i = 0; i < rectangles.length; i++) {
            s += rectangles[i];
            if(i != rectangles.length - 1) {
                s += "\n";
            }
        }
        return s;
    }
}
