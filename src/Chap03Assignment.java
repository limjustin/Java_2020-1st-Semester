import java.util.Scanner;

public class Chap03Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] c = new char[5];

        c[0] = scanner.next().charAt(0);
        c[1] = scanner.next().charAt(0);
        c[2] = scanner.next().charAt(0);
        c[3] = scanner.next().charAt(0);
        c[4] = scanner.next().charAt(0);

        double hash = c[0]*Math.pow(31,4) + c[1]*Math.pow(31,3) + c[2]*Math.pow(31,2) + c[3]*Math.pow(31,1) + c[4]*Math.pow(31,0);

        System.out.printf("문자열 %c%c%c%c%c의 해시 값은 %.2f입니다.",c[0],c[1],c[2],c[3],c[4],hash);

    }
}
