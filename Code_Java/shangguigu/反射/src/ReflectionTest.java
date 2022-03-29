import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *  》Reflection（反射） 是Java被视为动态语言的关键，反射机制允许程序在执行期
 *   借助Reflection API 取得任何类的内部信息，并能直接操作任意对象的内部属性和方法
 *  》加载完类之后，在堆内存的方法区就产生一个Class类型的对象（一个类只有一个Class对象），
 *    这个对象就包含了完整的类的结构信息。我们可以通过这个对象看到类的结构。这个对象就像
 *    一面镜子，通过这个镜子我们可以看到类的结构。所有我们形象的称之为：反射
 *
 *  Java反射机制提供的功能
 *  》在运行时判断任意一个对象所属的类
 *  》在运行时构造任意一个类的对象
 *  》在运行时判断任意一个类所具有的成员变量和方法
 *  》在运行时获取泛型信息
 *  》在运行时调用任意一个对象的成员变量和方法
 *  》在运行时处理注释
 *  》生成动态代理
 *
 *  反射相关的主要API
 *  》java.lang.Class:代表一个类
 *  》java.lang.reflect.Method:代表类的方法
 *  》java.lang.reflect.Field:代表类的成员变量
 *  》java.lang.reflect.Constructor:代表类的构造器
 *
 *  哪些类型可以有Class对象
 *  1.class:外部类、成员（成员内部类、静态内部类）、局部内部类、匿名内部类
 *  2.interface：接口
 *  3.[]:数组
 *  4.enum：枚举
 *  5.annotation：注解@interface
 *  6.primitive type:基本数据类型
 *  7.void
 */
public class ReflectionTest {
	//反射之前对于Person类的操作
	@Test
	public void test1(){
		//1.创建Person类的对象
		Person p1 = new Person("Tom",12);
		//2.调用内部的属性和方法
		p1.age=10;
		System.out.println(p1.toString());
		p1.show();

		//在Person类的外部不能调用私有结构
		//比如：name showNation()以及私有的构造器
	}

	//反射之后，对于Person的操作
	@Test
	public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
		Class clazz = Person.class;
		//1.通过反射创建Person类的对象
		Constructor cons = clazz.getConstructor(String.class, int.class);

		Object obj = cons.newInstance("tom", 18);
		System.out.println(obj.toString());
		//2.通过反射调用对象指定的对象和方法
		Field age = clazz.getDeclaredField("age");
		age.set(obj,10);
		System.out.println(obj.toString());

		//调用方法
		Method show = clazz.getDeclaredMethod("show");
		show.invoke(obj);

		//通过反射调用私有结构
		//调用私有的构造器
		Constructor cons1 = clazz.getDeclaredConstructor(String.class);
		cons1.setAccessible(true);
		Person p1 = (Person) cons1.newInstance("Jerry");
		System.out.println(p1);

		//调用私有的属性
		Field name = clazz.getDeclaredField("name");
		name.setAccessible(true);
		name.set(p1,"HanMeiMei");
		System.out.println(p1);

		//调用私有方法
		Method showNation = clazz.getDeclaredMethod("showNation", String.class);
		showNation.setAccessible(true);
		String nation = (String) showNation.invoke(p1, "中国");
		System.out.println(nation);

	}

	//疑问：通过newe的方式或反射的方式都可以调用公共的结构，开发到底用那个
	//》》 建议：直接用new的方式
	//什么时候使用反射？ 需要动态性的时候
	//疑问：反射机制与面向对象的封装性是不是矛盾的？如何看待这两个技术？
	//不矛盾。

	/**
	 * 关于java.lang.Class类的理解
	 * 1.类的加载过程：
	 *  程序经过javac.exe命令以后，会生成一个或多个字节码文件，接着我们
	 *  使用java.exe命令对某个字节码文件进行解释运行。相当于将某个字节码文件
	 *  加载到内存中，此过程称为类的加载。加载到内存中的类叫运行时类，就作为Class的实例
	 * 2.换句话说，Class的实例对应着运行时类
	 * 3.加载到内存中的运行时类，会缓存一定的时间，在此时间之内，我们可以通过
	 * 不同的方法获取此运行时类
	 *
	 * getFields():获取当前运行时类及其父类声明为public访问权限的属性
	 * getDeclaredField():获取当前运行时类中声明的所有属性（不包含父类中声明的属性）
	 */

	@Test
	public void test3() throws ClassNotFoundException {
		//方式一：调用运行时类的属性
		Class clazz1 = Person.class;
		System.out.println(clazz1);
		//方式二：通过运行时类的对象
		Person p1 = new Person();
		Class clazz2 = p1.getClass();
		System.out.println(clazz2);

		//方式三：调用Class的静态方法：forName(String classPath)(常用)
		Class clazz3 = Class.forName("Person");
		System.out.println(clazz3);

		System.out.println(clazz1 == clazz2);
		System.out.println(clazz1 == clazz3);

		//方式四：使用类的加载器：ClassLoader(仅限了解)
		ClassLoader classLoader = ReflectionTest.class.getClassLoader();
		Class clazz4 = classLoader.loadClass("Person");

		System.out.println(clazz1 == clazz4);
	}
}
