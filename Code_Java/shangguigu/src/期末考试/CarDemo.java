package ��ĩ����;

import java.util.Calendar;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("����",3.8,"������");
        car1.brand = "�µ�";
        car1.price = 38.0;
        car1.color = "��ɫ";
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }

}
class Car{
    String brand;
    double price;
    String color;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car() {
    }

    public Car(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ʒ�ƣ�'" + brand + "\n" +
                "�۸�" + price +"��\n"+
                "��ɫ��'" + color + '\n';
    }

}

