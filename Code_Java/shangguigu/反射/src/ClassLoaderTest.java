import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 了解类的加载器
 */
public class ClassLoaderTest {
	@Test
	public void test1(){
		//对于自定义类，使用系统类加载器进行加载
		ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
		System.out.println(classLoader);

		//调用系统类加载器的getParent():获取扩展类加载器
		ClassLoader classLoader1 = classLoader.getParent();
		System.out.println(classLoader1);
		//调用扩展类加载器的getParent():无法获取引导类加载器
		//引导类加载器主要负责加载Java的核心类库，无法加载自定义类
		ClassLoader classLoader2 = classLoader1.getParent();
		System.out.println(classLoader2);
	}

	/**
	 * Properties:用来读取配置文件
	 */
	@Test
	public void test2() throws IOException {
		Properties pros = new Properties();
		//此时的文件默认在module下
		/*FileInputStream fis = new FileInputStream("jdbc.properties");
		pros.load(fis);*/
		ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
		InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
		pros.load(is);


		String user = pros.getProperty("User");
		String password = pros.getProperty("password");
		System.out.println("User = "+user+" password = "+password);

	}
}
