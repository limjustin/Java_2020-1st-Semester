import java.awt.*;

class Block2 {

    Rectangle[] rectangles = new Rectangle[4];

    public Block2(Point p) {
        for(int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle(new Point((int) p.getX(), (int) p.getY()));
        }
        setBlock();
    }

    public Block2(int x, int y) {
        for(int i=0; i<rectangles.length; i++) {
            rectangles[i] = new Rectangle(new Point(x, y));
        }
        setBlock();
    }

    public void setBlock() {
        rectangles[0].translate(0,0);
        rectangles[1].translate(0, Rectangle.HEIGHT);
        rectangles[2].translate(0,Rectangle.HEIGHT*2);
        rectangles[3].translate(0, Rectangle.HEIGHT*3);
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
