import org.junit.Test;

import java.io.*;

/**
 * 其他流的使用
 * 1.标准的输入、输出流
 * 2.打印流
 * 3.数据流
 */
public class OtherStreamTest {
	/**
	 * 1.标准的输入、输出流
	 * 1.1
	 * System.in：标准的输入流、默认从键盘输入
	 * System.out：标准的输出流、默认从控制台输出
	 * 1.2
	 * System类的setIn(InputStream is)/setOut(PrintStream ps)重新指定输入和输出的流
	 */
	@Test
	public void test1() throws IOException {
		//使用System.in实现输入，System.in ---》 转换流 ---》 BufferedReader的readline()
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);

		while (true){
			String str = br.readLine();
			if(str.equalsIgnoreCase("e") | str.equalsIgnoreCase("exit")){
				System.out.println("程序结束");
				break;
			}

		}
	}


	/**
	 * 3.数据流
	 * 3.1 DataInputStream 和 DataOutputStream
	 * 3.2 作用：用于读取或写出基本数据类型的变量或字符串
	 */


	//练习：将内存中的字符串、基本数据类型的变量写入
	@Test
	public void test2() throws IOException{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("OtherStreamTest.txt"));
		dos.writeUTF("小明");
		dos.flush();
		dos.writeInt(23);
		dos.flush();
		dos.writeBoolean(true);
		dos.flush();
	}

	/**3
	 * 将文本中存储的基本数据类型和字符串读取到内存中，保存在变量中
	 * 注意：读取不同的数据的顺序要与当初写入文件时保存的顺序一样
	 * @throws IOException
	 */
	@Test
	public void test3() throws IOException{
		DataInputStream dis = new DataInputStream(new FileInputStream("OtherStreamTest.txt"));
		String name=dis.readUTF();
		int age = dis.readInt();
		Boolean isMale = dis.readBoolean();
		System.out.println("name = " +name);
		System.out.println("age = "+age);
		System.out.println("isMale = "+isMale);
	}
}
