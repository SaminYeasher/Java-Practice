class Person{
    String name ;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person(Person OtherPerson){
        this.name = OtherPerson.name;
        this.age = OtherPerson.age;
    }
    void showinfo(){
        System.out.println(name + " " + age);
    }
}
public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("samin",30);
        Person p2 = new Person(p1);
        p2.showinfo();

    }
}
