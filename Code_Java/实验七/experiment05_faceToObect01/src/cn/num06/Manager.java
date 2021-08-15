package cn.num06;

public class Manager {
	private String name;
	private int age;
	private String sex;
	private double sal;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(String name, int age, String sex, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.sal = sal;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", age=" + age + ", sex=" + sex + ", sal=" + sal + "]";
	}
	public void judge() {
		if(age<40) {
			System.out.println(name+"需要加班");
		}else {
			System.out.println(name+"不需要加班");
		}
	}
}
