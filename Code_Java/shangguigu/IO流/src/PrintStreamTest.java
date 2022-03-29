import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 打印流：PrintStream和PrintWriter
 * >提供一系列的重载print()、println（）方法，用于多种数据类型的输出
 * >PrintStream和PrintWriter的输出不会抛出IOException异常
 * >PrintStream和PrintWriter有自动Flush功能
 * >PrintStream打印的所有字符都使用平台默认的字符集编码转化为字节。
 *  在需要写入字符而不是写入字节的情况下，应该使用PrintWriter类
 * >System.out返回的是PrintStream的实例
 */
public class PrintStreamTest {
	@Test
	public void test1() throws IOException {
		FileOutputStream fos = new FileOutputStream("PrintStreamTest.txt");
		PrintStream ps = new PrintStream(fos,true);
		if(ps != null){
			//修稿默认的输出流方向，从控制台切换到ps流的方向
			System.setOut(ps);
		}

		for(int i =0;i<255;i++){
			System.out.print((char)i);
			if(i % 50 ==0){
				System.out.println();
			}
		}
	}
}
