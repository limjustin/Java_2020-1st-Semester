public class MP11 {
    private static final int NUM = 4;
    public static void main(String[] args) {

        Shape[] shapes = new Shape[NUM];

        // Shape 객체 배열 생성 (이름 좀 바꿨어요ㅠㅠ)
        shapes[0] = new RectangleClass(20, 30, 50, 50);
        shapes[1] = new CircleClass(30, 30, 20);
        shapes[2] = new RectangleClass(new Point(20, 30), new Point(50, 50));
        shapes[3] = new CircleClass(new Point(30, 30), 20);

        // 출력
        for (int i = 0; i < NUM; i++) {
            System.out.println(shapes[i]);
            System.out.printf("면적: %.2f\n", shapes[i].getArea());
            System.out.printf("둘레: %.2f\n", shapes[i].getPerimeter());
        }

    }

}
