package ʵ��һ01;

import java.util.GregorianCalendar;

public class CarDemo {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand="����";
		car1.color="������";
		car1.price = 3.5;
		car1.date.set(2021,9,15,19,30,11);
		
		System.out.println("--------------");
		System.out.println(car1.toString());
		Car car2 = new Car("�µ�",38.0,"��ɫ",new GregorianCalendar());
		car2.date.set(2021,9,15,19,30,11);
		System.out.println(car2.toString());
	}
}
