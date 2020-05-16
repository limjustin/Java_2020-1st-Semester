class CardDeck {
    int[] card_arr = new int[3];
    int count = card_arr.length;
    // 왜 여기에는 card_arr 값 선언 못 함??

    // CardDeck 기본 생성자로 랜덤 변수 배열 생성
    CardDeck() {
        card_arr[0] = (int) Math.floor(Math.random()*9) + 2;
        card_arr[1] = (int) Math.floor(Math.random()*9) + 2;
        card_arr[2] = (int) Math.floor(Math.random()*9) + 2;
    }

    // 몇 번째 카드를 뺐는지, 빠진 카드의 모양과 번호는 무엇인지 알려주는 함수
    void deal(int x) {
        System.out.println(x + "번째 카드를 덱에서 뺐습니다.");
        System.out.println("빠진 카드의 모양과 번호는 Diamond " + card_arr[x] + "입니다.");
    }

    // 카트 덱에 현재 몇 장의 카드가 있는지 화면에 출력
    void cardLeft() {
        System.out.println(--count + "장의 카드가 현재 남아있음.");
        System.out.println();
    }
}

public class Chap05Assignment {
    public static void main(String[] args){

        // CardDeck Class 객체 생성
        CardDeck cd = new CardDeck();

        // 카드를 한 장 나눠줌
        cd.deal(1);
        cd.cardLeft();

        cd.deal(2);
        cd.cardLeft();
    }
}

