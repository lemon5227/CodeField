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
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("学位："+degree);
	}
}
