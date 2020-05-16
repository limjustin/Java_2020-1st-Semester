/**
 * @author Jaeyoung Lim
 * @studentnumber 201910831
 * @since 20200507
 * MidTerm201910831
 */

enum TrafficFee {

//    LIGHT(8,7,5),
    LIGHT(9,8,4),
    PEDESTRIAN(8,7,5),
    YELLOW(10,9,0),
    BUSONLYHIGHWAY(10,9,0),
    LANE(4,4,3),
    OVER60(14,13,9),
    OVER4060(11,10,7),
//    OVER2040(8,7,5),
    OVER2040(12,11,8),
    OVER20(4,4,3);

    // Variable
    int VAN;
    int CAR;
    int AUTO;

    TrafficFee(int VAN, int CAR, int AUTO) {
        this.VAN = VAN;
        this.CAR = CAR;
        this.AUTO = AUTO;
    }

    int getVAN() {
        return VAN;
    }

    int getCAR() {
        return CAR;
    }

    int getAUTO() {
        return AUTO;
    }

}

public class MidTerm201910831Main {
    public static void main(String[] args) {

        String[] Name = {"LIGHT", "PEDESTRIAN", "YELLOW", "BUSONLYHIGHWAY", "LANE", "OVER60", "OVER4060", "OVER2040", "OVER20"};
        String[] Type = {"VAN", "CAR", "AUTO"};

        int name_index = 0, type_index = 0;
        int total = 0;

        // 1. Print HardCoding Case 3
        Fine fine = new Fine();
        System.out.println("CASE 1: fine: " + fine.CalculateFine(Name[7], Type[2]));
        System.out.println("CASE 2: fine: " + (fine.CalculateFine(Name[0], Type[0]) + fine.CalculateFine(Name[2], Type[0])));
        System.out.println("CASE 3: fine: " + (fine.CalculateFine(Name[3], Type[1]) + fine.CalculateFine(Name[5], Type[1])));

        // 2. Random Function and go to Fine Class
        for(int i = 0; i < 10; i++) { // Show 10 Cases
            name_index = (int) Math.floor(Math.random()*Name.length);
            type_index = (int) Math.floor(Math.random()*Type.length);
            System.out.println("car: " + Type[type_index] + ", violation: " + Name[name_index]  + ", fine: " + fine.CalculateFine(Name[name_index], Type[type_index]));
            total += fine.CalculateFine(Name[name_index], Type[type_index]);
        }
        System.out.println("Total Fine: " + total); // Show Total
    }
}