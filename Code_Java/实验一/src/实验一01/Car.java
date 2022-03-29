package ʵ��һ01;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Car {
	String brand;
	double price;
	String color;
	GregorianCalendar date = new GregorianCalendar();
	private int age;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
	
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
		return "Ʒ�ƣ�" + brand + "\n �۸�" + price + "��\n ��ɫ��" + color + "\n �������ڣ�" + sdf.format(date.getTime()) ;
	}
	
	
	

}
