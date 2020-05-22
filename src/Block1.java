import java.awt.*;

class Block1 {

    Rectangle[] rectangles = new Rectangle[4];

    public Block1(Point p) {
//        for(int i)

    }

    public Block1(int x, int y) { // 처음 Block 객체 만들었을 때 호출되는 Constructor
        for(int i=0; i<rectangles.length; i++) {
            rectangles[i] = new Rectangle(new Point(x, y));
        }
        setBlock();
    }

    public void setBlock() {
        rectangles[0].translate(0,0); // Rectangle Class에 있는 public void translate 함수를 사용함
        rectangles[1].translate(Rectangle.WIDTH, 0);
        rectangles[2].translate(0,Rectangle.HEIGHT);
        rectangles[3].translate(Rectangle.WIDTH, Rectangle.HEIGHT);
    }

    public void translate(int x, int y) {

//        setBlock();
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
