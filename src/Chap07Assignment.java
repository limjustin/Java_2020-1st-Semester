import java.util.Scanner;

/**
 * @author Jaeyoung Lim
 * @since 20200430
 * Chap07Assignment
 */
enum Card {
    CJONE_SAMSUNG(30,1),
    CJONE_SHINHAN(30,1),
    THE_CJ(20,2),
    SAMSUNG_6_V4(20,0),
    SHINHAN_LADY(20,0),
    KB_STAR(20,0),
    EMART_KB(15,0);

    int dcr;
    int acr;

    Card(int dcr, int acr) {
        this.dcr = dcr;
        this.acr = acr;
    }

    int getDcr() {
        return dcr;
    }

    int getAcr() {
        return acr;
    }
}

public class Chap07Assignment {
    public static void main(String[] args) {
        // 1. 문자열 입력
        Scanner scanner = new Scanner(System.in);
        String cardname = scanner.nextLine();
        // 2. 입력한 문자열 구분
        switch (cardname) {
            case "CJ ONE 삼성 카드":
                System.out.println(cardname + "의 카드 정보");
                System.out.println("할인율: " + Card.CJONE_SAMSUNG.getDcr() + "%");
                System.out.println("적립률: " + Card.CJONE_SAMSUNG.getAcr() + "%");
                break;
            case "CJ ONE 신한 카드":
                System.out.println(cardname + "의 카드 정보");
                System.out.println("할인율: " + Card.CJONE_SHINHAN.getDcr() + "%");
                System.out.println("적립률: " + Card.CJONE_SHINHAN.getAcr() + "%");
                break;
            case "The CJ":
                System.out.println(cardname + "의 카드 정보");
                System.out.println("할인율: " + Card.THE_CJ.getDcr() + "%");
                System.out.println("적립률: " + Card.THE_CJ.getAcr() + "%");
                break;
            case "삼성 6 V4":
                System.out.println(cardname + "의 카드 정보");
                System.out.println("할인율: " + Card.SAMSUNG_6_V4.getDcr() + "%");
                System.out.println("적립률: " + Card.SAMSUNG_6_V4.getAcr() + "%");
                break;
            case "신한 Lady":
                System.out.println(cardname + "의 카드 정보");
                System.out.println("할인율: " + Card.SHINHAN_LADY.getDcr() + "%");
                System.out.println("적립률: " + Card.SHINHAN_LADY.getAcr() + "%");
                break;
            case "KB Star":
                System.out.println(cardname + "의 카드 정보");
                System.out.println("할인율: " + Card.KB_STAR.getDcr() + "%");
                System.out.println("적립률: " + Card.KB_STAR.getAcr() + "%");
                break;
            case "이마트 KB":
                System.out.println(cardname + "의 카드 정보");
                System.out.println("할인율: " + Card.EMART_KB.getDcr() + "%");
                System.out.println("적립률: " + Card.EMART_KB.getAcr() + "%");
                break;
            default:
                System.out.println("해당하는 카드를 찾을 수 없습니다.");
                break;
        }
    }
}
