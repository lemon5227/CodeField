package cn.num01;

public class Phone {
	private String brand;
	private int price;
	private String color;
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phone(String brand, int price, String color) {
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
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
//		return  brand+"---"+price+"---"+color;
		return "Phone [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

}
