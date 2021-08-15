package cn.num08;

public class Car {
	private String brand;
	private double price;
	private String color;
	
	public Car() {
		this("奥迪",38.0,"黑色");
	}

	public Car(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "品牌：" + brand + "\n价格：" + price + "万\n颜色: " + color ;
	}
	
}
