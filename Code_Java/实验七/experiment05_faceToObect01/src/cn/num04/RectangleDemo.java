package cn.num04;

public class RectangleDemo {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setHeight(8);
		r1.setWidth(10);
		System.out.println(r1.toString());
		System.out.println("�ܳ�Ϊ��"+r1.zhouChang());
		System.out.println("���Ϊ��"+r1.area());
		System.out.println("-----------------------------");
		Rectangle r2 = new Rectangle(12, 9);
		System.out.println(r2);
		System.out.println("�ܳ�Ϊ��"+r2.zhouChang());
		System.out.println("���Ϊ��"+r2.area());
	}

}
