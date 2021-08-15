/*
 4、编程定义一个长方形类Rectangle。步骤如下：
（1）定义成员变量：长（int  height），宽（int  width）；
（2）定义无参构造方法，带参构造方法；
（3）定义以上成员变量对应的getXxx()/setXxx()方法；以及一个显示所有成员信息的toString()方法；
（4）定义求周长的zhouChang()方法和求面积的area()方法；
（5）定义一个测试类RectangleDemo，进行测试。测试结果如下：
 */
package cn.num04;
public class Rectangle {
	private int width;
	private int height;
	public Rectangle() {
		
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public int zhouChang() {
		return (width+height)*2;
	}
	
	public int area() {
		return width*height;
	}
	
	
}
