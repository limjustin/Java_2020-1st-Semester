import java.util.Scanner;

class Dice{

    int RolltheDice() {
        int c = 0;

        c=(int)(Math.random()*6)+1;

        return c;
    }
}

public class Jino {

    public static void main(String[] args) {

        Scanner a=new Scanner(System.in);
        System.out.println("몇번을 던질것인가요?:");
        int b=0;
        int sum = 0;
        b=a.nextInt();



        Dice r=new Dice();

        for(int i = 0; i < b ; i++) {
            sum+=r.RolltheDice();
        }



        if(sum/2==0)
            System.out.println("합:"+sum+"버스를 탑승합니다");
        else
            System.out.println("합:"+sum+"지하철을 탑승합니다");
    }
}