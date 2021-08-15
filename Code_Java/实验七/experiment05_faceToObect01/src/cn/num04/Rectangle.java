/*
 4����̶���һ����������Rectangle���������£�
��1�������Ա����������int  height������int  width����
��2�������޲ι��췽�������ι��췽����
��3���������ϳ�Ա������Ӧ��getXxx()/setXxx()�������Լ�һ����ʾ���г�Ա��Ϣ��toString()������
��4���������ܳ���zhouChang()�������������area()������
��5������һ��������RectangleDemo�����в��ԡ����Խ�����£�
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
