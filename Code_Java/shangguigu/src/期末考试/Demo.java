package 期末考试;



public class Demo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2.4,5.6);
        Circle c1 = new Circle(3.0);
        Sphere s1 = new Sphere(3.0);
        System.out.println(r1.toString());
        System.out.println(c1.toString());
        System.out.println(s1.toString());
    }
}
class Rectangle{
    double x;
    double y;

    public Rectangle() {
    }

    public Rectangle(double x) {
        this.x = x;
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double area(){
        return x*y;
    }

    @Override
    public String toString() {
        return "长方形的长为:"+x+"宽为："+y+"表面积为："+area();
    }
}

class Circle extends Rectangle{
    Circle(){
        super();
    }
    Circle(double x){
        super(x);
    }

    @Override
    public double area() {
        return 3.14*x*x;
    }

    @Override
    public String toString() {
        return "圆的半径为："+x+"面积为："+area();
    }
}
class Sphere extends Rectangle{
    Sphere(){
        super();
    }
    Sphere(double x){
        super(x);
    }

    @Override
    public double area() {
        return 4*3.14*x*x;
    }

    @Override
    public String toString() {
        return "球的半径为"+x+"表面积为"+area();
    }
}