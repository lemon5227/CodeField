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
                "Բ�İ뾶=" + x +
                ", ������=" + all_area +
                '}';
    }
}
