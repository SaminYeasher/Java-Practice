abstract class Sub{
    String name,id;
    abstract void showinfo();
}
class CSE extends Sub{
    String dept;
    public CSE(String name,String id,String dept){
        this.name =name;
        this.id =id;
        this.dept =dept;
    }
    void showinfo(){
        System.out.println(name+" "+id+" "+dept);
    }

}

public class Main7 {
    public static void main(String[] args) {
    CSE c1 = new CSE("Samin","231000712","CSE");
    c1.showinfo();
    }
}
