package test04;

public class Test04 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setX(5.6);
        r1.setY(2.4);
        r1.area();
        System.out.println(r1.toString());
        Circle c1 = new Circle(3.0);
        c1.area();
        System.out.println(c1.toString());
        Sphere s1 = new Sphere(3.0);
        s1.area();
        System.out.println(s1.toString());
        Cylinder cy1 = new Cylinder(3.0,5.0);
        cy1.area();
        System.out.println(cy1.toString());

    }
}
