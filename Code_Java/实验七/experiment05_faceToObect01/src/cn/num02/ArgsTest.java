/*
2、类名作参数进行方法调用的传递问题。
形式参数的问题：
	基本类型：形式参数的改变不影响实际参数。实参应该有确定的值，
	                   且其值的数据类型级别不能高于对应的形参数据类型的级别，
	                   参数的传递相当于赋值语句，即实参的值赋给形参。
	引用类型：形式参数的改变直接影响实际参数。参数的传递相当于赋值语句，
	                  实参的地址赋给形参，使得形参和实参指向同一个堆内存空间。
	如果你看到一个方法需要的参数是一个类名或者接口名，就应该知道这里实际需要的是一个具体的对象。
*/
package cn.num02;
public class ArgsTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		Demo d = new Demo();
		int result = d.sum(a, b);// 基本类型作参数传递
		System.out.println(result);
		System.out.println("---------------------------");
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		sd.method(s);            // 引用类型作参数传递
	}
}
//形式参数是基本类型
class Demo {
	public int sum(int a, int b) {
		return a + b;
	}
}
//Student是一个引用类型，相当于基本类型中的某个类型，比如int
class Student {
	public void show() {
		System.out.println("我们爱Java！");
	}
}
//形式参数是引用类型
class StudentDemo {
	public void method(Student s) {
		s.show();
	}
}
