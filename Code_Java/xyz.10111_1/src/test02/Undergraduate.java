package test02;

public class Undergraduate extends Student {
	String degree;
	public Undergraduate() {
		
	}
	public Undergraduate(String name,int age,String degree) {
		this.age=age;
		this.name=name;
		this.degree=degree;
	}	
	public void show() {
		System.out.println("������"+name);
		System.out.println("���䣺"+age);
		System.out.println("ѧλ��"+degree);
	}
}
