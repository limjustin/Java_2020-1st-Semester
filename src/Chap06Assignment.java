import java.util.Scanner;

class Dices {
    int sum = 0;
    int num = 0;
    void roll(int n) {
        for(int count = 1; count <= n; count++) {
            num = (int) Math.floor(Math.random()*6) + 1;
            sum += num;
        }
    }
    int getNum() {
        System.out.println("합계: " + sum);
        return sum;
    }

}

public class Chap06Assignment {
    public static void main(String[] args) {
        // 1. 사용자에게 정수를 입력 받음
        Scanner scanner = new Scanner(System.in);
        System.out.print("횟수: ");
        int n = scanner.nextInt();

        // 2. Dice 클래스 객체 생성
        Dices dice = new Dices();

        dice.roll(n);
        int res = dice.getNum();

        // 3. 선택하기
        if(res % 2 == 0) {
            System.out.println("짝수가 나왔으므로 버스를 탑니다");
        } else {
            System.out.println("홀수가 나왔으므로 지하철을 탑니다");
        }

    }
}
