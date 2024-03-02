class Sd{
    int id;
    public Sd(int a){
        id = a;
    }
    public Sd(Sd d){
        this.id =d.id;
    }
}
public class Main4 {
    public static void main(String[] args) {
        Sd s1 = new Sd(12);
        Sd s2 = new Sd(s1);
        System.out.println(s2.id);
    }
}
