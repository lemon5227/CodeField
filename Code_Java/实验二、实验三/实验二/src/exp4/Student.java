package exp4;

public class Student implements Comparable<Student>{
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "姓名："+name+"年龄："+age;
	}

	@Override
	public int compareTo(Student o) {
		int result = Integer.valueOf(this.age).compareTo(Integer.valueOf(o.age));
		if(result != 0){
			return result;
		}
		return this.name.compareTo(o.name);
	}

}
