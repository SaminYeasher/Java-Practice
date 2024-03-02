

/* This is for public*/

class Add{
    int value ;
    public  int add(Add a,Add b){
        return a.value+b.value;
        }
    }

public class Main3 {
    public static void main(String[] args) {
        Add a1 = new Add();
        Add a2 = new Add();
        a1.value =9;
        a2.value =8;
        int res = a1.add(a1,a2);
        System.out.println(res);

    }
}

