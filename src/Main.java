class Student {
    int id ;
    String name;
    public  Student(String name){
        this.id = id;
        this.name = name;
    }
    public  void  Showinfo(Student S){
        System.out.println(id+ " " + name);
    }
}
public class Main {
    public static void main(String[] args) {

        Student S1 = new Student("Samin");
        Student S2 = new Student("Alvi");
        S1.Showinfo(S2);
        }
    }
