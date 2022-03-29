import org.junit.Test;

import java.lang.reflect.Field;

/**
 *  调用运行时类中指定的结构:属性、方法、构造器
 *
 */
public class ReflectionTest2 {
	@Test
	public void testField() throws NoSuchFieldException, InstantiationException, IllegalAccessException {
		Class clazz = Person.class;

		//创建运行时类的对象

		Person p = (Person)clazz.newInstance();
		//getField（）获取权限为public的属性
		Field name = clazz.getDeclaredField("name");
		name.setAccessible(true);
		name.set(p,"tom");

		System.out.println(p);

	}
}
