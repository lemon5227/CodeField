package test04;

public class Cylinder extends Rectangle{
    double all_area;
    public Cylinder(){

    }
    public Cylinder(double x,double y){
        super.x=x;
        super.y=y;
    }
    @Override
    public void area(){
        all_area=3.14*2*super.x*super.x+2*3.14*super.y;
    }

    @Override
    public String toString() {
        return
                "圆柱体面积" + all_area +
                ", 半径" + x +
                ", 高" + y ;
    }
}
