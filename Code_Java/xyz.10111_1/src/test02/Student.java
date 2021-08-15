package test02;

public class Student {
	String name;
	int age;
	public Student() {
		
	}
	public Student(String name,int age) {
		this.age=age;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show() {
		System.out.println("ĞÕÃû£º"+name);
		System.out.println("ÄêÁä£º"+age);
	}
}
