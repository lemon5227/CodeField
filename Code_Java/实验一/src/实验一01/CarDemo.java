package 实验一01;

import java.util.GregorianCalendar;

public class CarDemo {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand="奥拓";
		car1.color="土豪金";
		car1.price = 3.5;
		car1.date.set(2021,9,15,19,30,11);
		
		System.out.println("--------------");
		System.out.println(car1.toString());
		Car car2 = new Car("奥迪",38.0,"黑色",new GregorianCalendar());
		car2.date.set(2021,9,15,19,30,11);
		System.out.println(car2.toString());
	}
}
