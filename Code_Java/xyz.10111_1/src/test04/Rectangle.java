package test04;

public class Rectangle {
	double x;
	double y;
	double all_area;
	public  Rectangle(double x) {
		
	}
	public Rectangle(double x,double y) {
		
	}

	public Rectangle() {
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
	public void  area() {
		all_area = x*y;
	}
	@Override
	public String toString() {
		return "宽为："+x+"长为："+y+"面积为："+all_area;
	}
}
