class Bicycle {
    int gear;
    int speed;

    public Bicycle(int g, int s) {
        gear = g;
        speed = s;
    }
}
    class Motorbike extends Bicycle{
        int seatHeight;
        public Motorbike(int ge,int sp,int startHeight){
            super(ge,sp);
            seatHeight = startHeight;
        }
    }
public class Main1 {
    public static void main(String[] args) {
        Motorbike m =new Motorbike(3,10,15);
        System.out.println(m.gear +" "+ m.speed+ " " + m.seatHeight );
    }
}
