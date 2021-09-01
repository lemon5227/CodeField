package 期末考试;

import java.util.Calendar;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("奥托",3.8,"土豪金");
        car1.brand = "奥迪";
        car1.price = 38.0;
        car1.color = "黑色";
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
        return "品牌：'" + brand + "\n" +
                "价格：" + price +"万\n"+
                "颜色：'" + color + '\n';
    }

}

