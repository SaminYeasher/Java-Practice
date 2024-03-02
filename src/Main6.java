import java.lang.Math;
abstract class Shape{
    String color;
    abstract double area();
    public abstract String toString();

    public Shape(String color){
        //System.out.println("Shape constructor called");
        this.color =color;
    }
    public String getColor(){
        return color;
    }
}




class Circle extends Shape{
    double rad;
    public Circle(String color,Double rad){
        super(color);
        //System.out.println("Circle called");
        this.rad=rad;
    }
    double area(){
        return Math.PI * Math.pow(rad,2);
    }
    public String toString(){
        return "Circle color is " + color +" and area is : "+ area();
    }
}

class Rectangle extends Shape{
    double length,width;
    public Rectangle(String color,double length ,double width){
        super(color);
        //System.out.println("Rectangle called");
        this.length =length;
        this.width =width;
    }
    double area (){
        return length * width;
    }
    public String toString(){
        return "Rectangular color is " + color +" and area is : "+ area();
    }
}

public class Main6 {
    public static void main(String args[]) {

        Shape s1 = new Circle("red",2.2);
        Shape s2 = new Rectangle("Yellow",2,4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
