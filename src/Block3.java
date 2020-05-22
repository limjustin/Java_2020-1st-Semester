import java.awt.*;

class Block3 {
    Rectangle[] rectangles = new Rectangle[4];

    public Block3(Point p) {
        for(int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle(new Point((int) p.getX(), (int) p.getY())); // 이런 식으로 가져와야 Point p 활용 가능
        }
        setBlock();
    }

    public Block3(int x, int y) {
        for(int i=0; i<rectangles.length; i++) {
            rectangles[i] = new Rectangle(new Point(x, y));
        }
        setBlock();
    }

    public void setBlock() {
        rectangles[0].translate(0,0);
        rectangles[1].translate(0, Rectangle.HEIGHT);
        rectangles[2].translate(Rectangle.WIDTH, Rectangle.HEIGHT);
        rectangles[3].translate(Rectangle.WIDTH*2, Rectangle.HEIGHT);
    }

    public void translate(int x, int y) {
        for(int i = 0; i < rectangles.length; i++) {
            rectangles[i].translate(x, y);
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
