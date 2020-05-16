import java.util.Scanner;

public class Chap04Assignment {
    public static void main(String[] args) {
        // 1. 기존 문자열 선언
        String str = "Let's meet in my office at 10";
        System.out.println("다음 문장에서 문자열을 바꾸는 프로그램입니다.");
        System.out.println("원본 문장: " + str);

        // 2. 바꾸고 싶은 문자열 받기
        Scanner scanner = new Scanner(System.in);

        System.out.println("문장에서 바꾸고 싶은 문자열을 입력하세요:");
        String want_to_change = scanner.nextLine();

        // 3. 새로운 문자열 입력 받기
        System.out.println("새로운 문자열을 입력하세요:");
        String new_to_change = scanner.nextLine();

        // 4. 길이에 대한 처리
        int index_want = str.indexOf(want_to_change); // 바꾸고 싶은 문자열의 index 반환
        int length_want = want_to_change.length(); // 새로운 문자열의 길이를 반환 -> 문자열 중간에 없앨 문자열의 index 뛰어 넘게 할 수 있는 역할
        int remove = index_want + length_want; // 없앨 문자열 다음 부터의 index 를 찾기 위해서

        // 5. 바꾸고 싶은 문자열 제외한 앞 뒤 문장 처리
        String newStr_left = str.substring(0, index_want);
        String newStr_right = str.substring(remove, str.length());

        // 6. 문자열 합치기 및 출력
        String newStr = newStr_left + new_to_change + newStr_right;
        System.out.println("새로운 문장: " + newStr);
    }
}
