/**
 * @author Jaeyoung Lim
 * @studentnumber 201910831
 * @since 20200507
 * MidTerm201910831_Fine Class
 */

public class Fine {
    int CalculateFine(String name, String type) {
        switch(name) {
            case "LIGHT" :
                if(type == "VAN") return TrafficFee.LIGHT.getVAN();
                else if(type == "CAR") return TrafficFee.LIGHT.getCAR();
                else return TrafficFee.LIGHT.getAUTO();
            case "PEDESTRIAN" :
                if(type == "VAN") return TrafficFee.PEDESTRIAN.getVAN();
                else if(type == "CAR") return TrafficFee.PEDESTRIAN.getCAR();
                else return TrafficFee.PEDESTRIAN.getAUTO();
            case "YELLOW" :
                if(type == "VAN") return TrafficFee.YELLOW.getVAN();
                else if(type == "CAR") return TrafficFee.YELLOW.getCAR();
                else return TrafficFee.YELLOW.getAUTO();
            case "BUSONLYHIGHWAY" :
                if(type == "VAN") return TrafficFee.BUSONLYHIGHWAY.getVAN();
                else if(type == "CAR") return TrafficFee.BUSONLYHIGHWAY.getCAR();
                else return TrafficFee.BUSONLYHIGHWAY.getAUTO();
            case "LANE" :
                if(type == "VAN") return TrafficFee.LANE.getVAN();
                else if(type == "CAR") return TrafficFee.LANE.getCAR();
                else return TrafficFee.LANE.getAUTO();
            case "OVER60" :
                if(type == "VAN") return TrafficFee.OVER60.getVAN();
                else if(type == "CAR") return TrafficFee.OVER60.getCAR();
                else return TrafficFee.OVER60.getAUTO();
            case "OVER4060" :
                if(type == "VAN") return TrafficFee.OVER4060.getVAN();
                else if(type == "CAR") return TrafficFee.OVER4060.getCAR();
                else return TrafficFee.OVER4060.getAUTO();
            case "OVER2040" :
                if(type == "VAN") return TrafficFee.OVER2040.getVAN();
                else if(type == "CAR") return TrafficFee.OVER2040.getCAR();
                else return TrafficFee.OVER2040.getAUTO();
            case "OVER20" :
                if(type == "VAN") return TrafficFee.OVER20.getVAN();
                else if(type == "CAR") return TrafficFee.OVER20.getCAR();
                else return TrafficFee.OVER20.getAUTO();
            default:
                return 0;
        }
    }
}
