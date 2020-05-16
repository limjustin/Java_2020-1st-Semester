import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        // 입력값 받기
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 판별값 계산
        int inroot = b*b-4*a*c;

        // 해의 값 초기화
        double res_plus = 0;
        double res_minus = 0;

        // 판별값 통한 조건 분할
        if(inroot >= 0) {
            // 값 계산
            res_plus = ((-b+sqrt(inroot))/2*a);
            res_minus = ((-b-sqrt(inroot))/2*a);
            // 출력
            System.out.println("+일때: " + res_plus);
            System.out.println("-일때: " + res_minus);
        } else { // 예외 처리
            System.out.println("다시 입력하세요!!");
        }
    }
}
