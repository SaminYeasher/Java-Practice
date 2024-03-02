interface Vehicle{
    void changeGear(int a);
    //void speedUp(int a);
    //void applybracke(int a);
    default void showinfo(){
        System.out.println("Hello I am from interface");
    }
}
class Car implements Vehicle{
     public void changeGear(int a){
        System.out.println("Change Gear "+ a);
    }
}
public class Main8 {
    public static void main(String[] args) {
    Car c1 =new Car();
    c1.changeGear(12);
    c1.showinfo();
    }
}
