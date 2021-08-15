package test04;

public class Circle extends Rectangle {
	double all_area;

	public Circle(double x) {
		super.x=x;

	}

	@Override
	public void area() {
		all_area=super.x*super.x*3.14;
	}

	@Override
	public String toString() {
		return "圆的半径为："+x+"圆的面积为："+all_area;
	}

	
}
