import org.junit.Test;

import java.io.*;

/**
 * 处理流之六：对象流
 *  ObjectInputStream和ObjectOutputStream
 *  》用于存储和读取基本数据类型数据或对象的处理流。
 *    他的强大支持就是可以把Java中的对象写入数据源中，
 *    也能把对象从数据源中还原回来
 *  》序列化：用ObjectOutputStream保存基本数据类型或对象的机制
 *  》反序列化：用ObjectInputStream读取基本数据类型或对象的机制
 *
 *  ObjectInputStream和ObjectOutputStream不能序列化static和transient修饰的成员变量
 */
public class ObjectStreamTest {
	/**
	 * 对象流的使用
	 * 1.ObjectInputStream和ObjectOutputStream
	 */
	@Test
	public void test1() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));

		oos.writeObject(new String("我爱北京天安门"));
		oos.flush();

		oos.writeObject(new Person("小明",25));
		oos.flush();
		oos.close();
	}

	/**
	 * 反序列化：将磁盘文件中的对象还原为内存中的一个对象
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@Test
	public void test2() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
		Object obj = ois.readObject();
		String str = (String) obj;
		System.out.println(str);
		Object o1 = ois.readObject();
		Person p = (Person) o1;
		System.out.println(p);
		ois.close();

	}

}
