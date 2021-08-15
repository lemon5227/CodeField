package cn.num07;
public class Student {
	public String name;
	private int age;
	public char sex;
	public Student() {
		super();
	}
	public Student(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	public void showInfo() {
		System.out.println("姓名："+name+"\n年龄："+age+"\n性别："+sex);
	}
}
