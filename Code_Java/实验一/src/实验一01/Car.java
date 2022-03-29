package 实验一01;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Car {
	String brand;
	double price;
	String color;
	GregorianCalendar date = new GregorianCalendar();
	private int age;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
	
	public Car() {
		super();
	}



	public Car(String brand, double price, String color, GregorianCalendar date) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.date = date;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "品牌：" + brand + "\n 价格：" + price + "万\n 颜色：" + color + "\n 销售日期：" + sdf.format(date.getTime()) ;
	}
	
	
	

}
