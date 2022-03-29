import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/**
 *  RandomAccessFile声明在Java.io包下，但直接继承于Java.lang.Object
 *  并且实现了DataInput、DataOutput这两个接口，意味着这个类既可以读也可以写
 *  RandomAccessFile类支持“随机访问”的方式，程序可以直接跳到文件的任意地方来读写
 *      >只支持访问文件的部分内容
 *      >可以向已存在的文件后追加内容
 *  RandomAccessFile对象包含一个指针，用以标记当前读写处的位置
 *  RandomAccessFile类对象可以自由移动记录指针
 *      >long getFilePointer():获取文件记录指针的当前位置
 *      >void seek(long pos):将文件记录指针定位到pos位置
 */
public class RandomAccessFileTest {
	/**
	 * RandomAccessFile既可以当输入流也可以当输出流
	 */

	@Test
	public void test1() throws IOException {
		RandomAccessFile ref1 = new RandomAccessFile(new File("oldpic.jpg"),"r");
		RandomAccessFile ref2 = new RandomAccessFile(new File("newpic.jpg"),"rw");

		byte[] buf = new byte[1024];
		int len;
		while((len = ref1.read(buf)) != -1){
			ref2.write(buf,0,len);
		}

		ref1.close();
		ref2.close();
	}

	/**
	 * RandomAccessFile 作为输出流时，写出到的文件如果不存在，则在执行过程中自动创建
	 *  如果写出到的文件存在，则会对原有内容进行覆盖。（默认情况下，从头覆盖）
	 * @throws IOException
	 */
	@Test
	public void test2() throws IOException {
		RandomAccessFile ref1 = new RandomAccessFile("hello.txt","rw");
		//使用seek移动指针，达到在选择的位置插入
		ref1.seek(3);
		ref1.write("yyyy".getBytes());

		ref1.close();
	}

	/**
	 * 使用RandomAccessFile 实现数据的插入
	 *
	 */
	@Test
	public void test3() throws IOException{
		RandomAccessFile ref1 = new RandomAccessFile("hello.txt","rw");

		ref1.seek(3);
		//保存指针3后面的数据
		StringBuilder builder = new StringBuilder((int)new File("hello.txt").length());
		byte[] buf = new byte[20];
		int len;
		while ((len = ref1.read(buf)) != -1){
			builder.append(new String(buf,0,len));
		}
		//调回指针，写入”xyz“
		ref1.seek(3);
		ref1.write("xyz".getBytes());
		//将StringBuilder中的数据写入文件
		ref1.write(builder.toString().getBytes());
		ref1.close();

	}
}
