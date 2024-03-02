interface A{

}
interface B extends A{

}

interface C extends A{

}
interface D extends B,C{

}

interface E extends B{

}
class F implements D,E{

}
class G extends F{

}
public class Main9 {
    public static void main(String[] args) {

    }
}
