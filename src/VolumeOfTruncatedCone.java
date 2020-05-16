import java.util.Scanner;

public class VolumeOfTruncatedCone {
    public static void main(String[] args) {
        // 입력 Scanner 만들기
        Scanner scanner = new Scanner(System.in);
        // 변수 생성
        double R1 = scanner.nextDouble();
        double R2 = scanner.nextDouble();
        double Height = scanner.nextDouble();

        // 부피 변수
        double Volume = ((double)1/3)*3.14*(R1*R1+R1*R2+R2*R2)*Height;

        // 출력
        System.out.println(Volume);
    }
}
