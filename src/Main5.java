class One {
    public void print_hello(){
        System.out.println("Hello");
    }
}
class Two extends One{
    public void print_for(){
        System.out.println("For");
    }
}
class Three extends Two{
    public void print_Three(){
        System.out.println("Three");
    }
}
public class Main5 {
    public static void main(String[] args) {
    Three g = new Three();
    g.print_hello();
    g.print_for();
    g.print_Three();

    }
}
