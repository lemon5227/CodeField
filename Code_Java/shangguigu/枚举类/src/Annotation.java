import java.util.ArrayList;

public class Annotation {

}


//@MyAnnotation(value = "hello")
//jdk8之前的写法
//@MyAnnotations(values = {@MyAnnotation(value = "hello"), @MyAnnotation(value = "world")})
@MyAnnotation(value = "hello")
@MyAnnotation(value = "world")
class Person{
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Generic<@MyAnnotation("") T>{
	public  void show() {

	}
}
