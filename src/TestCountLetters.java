import java.util.Map;

public class TestCountLetters {
    public static void main(String[] args) {
        // 테스트할 문자열 선언
        String testingStr = "Sangmyung University 2020";

        // CountLetters 객체 선언
        CountLetters cl = new CountLetters(testingStr);

        // Map으로 받기
        Map<String, Integer> map = cl.countDigitsAndLetters();

        // 결과값 출력
        System.out.print(cl.toString());
    }
}
