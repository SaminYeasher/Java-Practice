class Addition{
    public int add(int a,int b){
        return a+b;
    }
}
public class Main2 {
    //psvm the click enter for public static void main(String[] args)
    public static void main(String[] args) {
    Addition a = new Addition();
    int res = a.add(12,13);
    System.out.println("Sum is "+res);

    }
}
