package services;

public class Student {
	 String name;
	 int age;
	 int lendBooks;

	public Student() {
	}

	public Student(String name, int age, int lendBooks) {
		this.name = name;
		this.age = age;
		this.lendBooks = lendBooks;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getLendBooks() {
		return lendBooks;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				", lendBooks=" + lendBooks +
				'}';
	}
}
