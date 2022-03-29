import java.io.Serializable;

public class Person  implements Serializable {
	//如果没有显式的定义这个静态变量，Java会根据类的内部细节自动生成。
	// 如果类的实例变量修改了，serialVersionUID可能会发生变化，索引建议显式声明
	 /* *
	 *  简单来说，Java的序列化机制是通过判断类的serialVersionUID来验证版本一致性，
	 * 进行反序列化时，JVM会把传来的字节流的serialVersionUID与本地进行比较
	 * 如果相同认为是一致的，否则就会出现序列化版本不一致的异常（InvalidException）
	 */

	private static final long serialVersionUID = 849794470755457710L;
	/**
	 * Person需要满足如下的要求，方可序列化
	 * 1.需要实现接口 Serializable
	 * 2.除了当前的Person类需要实现Serializable接口，
	 *      还需要保证其内部所有属性也必须是可序列化的（默认情况下基本数据类型是可序列化的
	 */
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
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

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
