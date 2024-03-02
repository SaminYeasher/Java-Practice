class FullNumber {
    int value;
    public int add(FullNumber num1, FullNumber num2){
        int sum = num1.value + num2.value;
        System.out.println(sum);
        return sum;
    }
}
public class MyClass {
    public static void main(String[] args) {
        FullNumber num1 = new FullNumber();
        FullNumber num2 = new FullNumber();
        num1.value = 7;
        num2.value = 7;
        num1.add(num1, num2);
    }
}