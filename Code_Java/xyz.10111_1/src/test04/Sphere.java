package test04;

public class Sphere extends Rectangle {
    double all_area;
    public Sphere(){

    }
    public Sphere(double x){
        super.x=x;
    }

    @Override
    public void area() {
        all_area=4*3.14*super.x*super.x;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "圆的半径=" + x +
                ", 球的面积=" + all_area +
                '}';
    }
}
