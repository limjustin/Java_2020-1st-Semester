class Subway{
    int line;
    Subway(){
        System.out.println("Hello World!");
    }
    Subway(int l){
        System.out.println("default constructor");
        line = l;
    }
//    void setLine(int l) {
//        line = l;
//    }
    void run() {
        System.out.println(line + " line runs");
    }
}

public class Practice {
    public static void main(String[] args){
        Subway sb = new Subway(1);
//        sb.setLine(4);
        sb.run();
    }
}
