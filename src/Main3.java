

/* This is for public*/

class Add{
    int value ;
    public static int method(Add a1,Add a2){
        return a1.value+a2.value;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Add a1 = new Add();
        Add a2 = new Add();
        a1.value =9;
        a2.value =8;
        int res = Add.method(a1,a2);
        System.out.println(res);

    }
}

