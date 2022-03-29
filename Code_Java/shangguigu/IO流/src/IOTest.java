import org.junit.Test;

import java.io.*;

/**
 * 一、流的分类
 * 按操作的单位不同分为：字节流（8bit），字符流（16 bit）
 * 按操作的流向不同分为：输入流、输出流
 * 按流的角色不同分为：节点流、处理流
 * 二、流的体系结构
 *  抽象基类        节点流（文件流）        缓存流（处理流的一种）
 *  InputStream    FileInputStream      BufferedInputStream
 *  OutputStream   FileOutputStream     BufferedOutputStream
 *  Reader         FileReader           BufferedReader
 *  Writer         FileWriter           BufferedWriter
 */
public class IOTest {
	@Test
	public void test1() throws IOException {
		//1.指明要操作的文件
		File file = new File("hello.txt");//Module
		//2.提供具体的流
		FileReader reader = new FileReader(file);
		//数据读入
		//read() ：返回读入的一个字符。如果达到末尾，返回-1
		int data = reader.read();
		while(data != -1){
			System.out.print((char)data);
			data = reader.read();
		}
		//4.流的关闭
		reader.close();
	}

	@Test
	public void test2() throws IOException {
		//1.File类的实例化
		File file = new File("hello.txt");
		//2.FileReader流的实例化
		FileReader reader = new FileReader(file);
		//3.读写的操作
		//因为是字符流用char 如果是字节流用byte
		char[] cbuf = new char[5];
		int len;
		//read(cbuf) 返回读入的字符数，如果到文件末尾，返回-1
		while((len = reader.read(cbuf)) != -1){
			for(int i =0;i<cbuf.length;i++){
				System.out.print(cbuf[i]);
			}
		}
		//4.资源的关闭
		reader.close();
	}

	/**
	 * 从内存中写出数据到硬盘里的文件
	 * 说明：
	 * 1.输出操作，对应的file可以不存在，
	 *      如果不存在，会自动创建文件
	 *      如果存在，如果流使用的构造器使用的FileWrite（file,false）/FileWrite（file)，会对原有文件进行覆盖
	 *          如果使用的构造器为FileWrite（file,true），会对原有文件进行追加
	 */
	@Test
	public void test3() throws IOException {
		//1.File类的实例化
		File file = new File("hello.txt");

		FileWriter fw = new FileWriter(file);

		fw.write("I have a dream");
		fw.write("\nYou also need a dream");
		fw.close();
	}

	@Test
	public void test4() throws IOException {
		//字符流不能处理图片（字节类型的数据）
		File srcfile = new File("oldpic.jpg");
		File destFile = new File("newpic.jpg");

		FileReader fr = new FileReader(srcfile);
		FileWriter fw = new FileWriter(destFile);

		//数据的读取和写入
		char[] cbuf = new char[5];
		int len;
		while ((len = fr.read(cbuf)) != -1){
			//每次写入len个字符
			fw.write(cbuf,0,len);
		}

		//资源关闭
		fw.close();
		fr.close();
	}

	//字节流不能读取文本中的中文，因为中文不是单文件字符
	@Test
	public void test5() throws IOException {
		File srcfile = new File("oldpic.jpg");
		File destFile = new File("newpic.jpg");

		FileInputStream fr = new FileInputStream(srcfile);
		FileOutputStream fw = new FileOutputStream(destFile);

		//数据的读取和写入
		byte[] buf = new byte[1024];
		int len;
		while((len = fr.read(buf)) != -1){
			fw.write(buf, 0, len);
		}

		//资源关闭
		fw.close();
		fr.close();
	}

	//缓冲流的使用
	@Test
	public void test6() throws IOException {
		File srcFile = new File("oldpic.jpg");
		File destFile = new File("newpic2.jpg");

	}

	//处理流：转换流的使用
	/**
	 * 1.转换流：属于字符流
	 * InputStreamReader: 将一个字节的输入流转换为字符的输入流
	 * OutputStreamWriter：将一个字符的输出流转换为字节的输出流
	 * 2.作用：提供字节流与字符流之间的转换
	 * 3. 解码：字节、字节数组 ---》字符数组、字符串
	 *    编码：字符数组、字符串 ---》 字节、字节数组
	 */

	@Test
	public void test7() throws IOException {
		FileInputStream fis = new FileInputStream("hello.txt");
		//参数二指明的字符集取决于文件 hello.txt保存时选择的字符集
		InputStreamReader reader = new InputStreamReader(fis,"UTF-8");
		char[] cbuf = new char[20];
		int len;
		while ((len = reader.read(cbuf)) !=-1){
			String str = new String(cbuf,0,len);
			System.out.print(str);
		}
	}

	@Test
	public void test8() throws  IOException{
		File file1 = new File("hello.txt");
		File file2 = new File("hello_gbk.txt");

		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);

		InputStreamReader reader = new InputStreamReader(fis);
		OutputStreamWriter writer = new OutputStreamWriter(fos,"gbk");

		char[] cbuf = new char[1024];
		int len;
		while ((len = reader.read(cbuf))!=-1){
			writer.write(cbuf,0,len);
		}
		reader.close();
		writer.close();

	}
}
