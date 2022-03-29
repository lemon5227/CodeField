import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP的网络编程
 * 例题4：服务器发送文件给客户端，客户端将文件保存到本地
 */
public class TCPTest4 {
	@Test
	public void Client() throws IOException {
		Socket socket = new Socket("127.0.0.1",8848);
		InputStream is = socket.getInputStream();
		FileOutputStream fos = new FileOutputStream("newpic_3.jpg");
		byte[] buf = new byte[1024];
		int len;
		while ((len = is.read(buf)) != -1){
			fos.write(buf,0,len);
		}

		fos.close();
		is.close();
		socket.close();
	}

	@Test
	public void Server() throws IOException {
		ServerSocket ss = new ServerSocket(8848);
		Socket socket = ss.accept();
		OutputStream os = socket.getOutputStream();
		FileInputStream fis = new FileInputStream("newpic_1.jpg");

		int len;
		byte[] buf = new byte[1024];
		while ((len = fis.read(buf)) != -1){
			os.write(buf,0,len);
		}

		fis.close();
		os.close();
		socket.close();
		ss.close();
	}
}
