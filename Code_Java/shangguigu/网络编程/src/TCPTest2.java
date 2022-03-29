import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 实现TCP的网络编程
 *  例题2：客户端发送文件给服务器，服务端将文件保存到本地
 *
 */
public class TCPTest2 {
	@Test
	public void Client() throws IOException {
		Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9097);
		OutputStream os =socket.getOutputStream();
		FileInputStream fis = new FileInputStream("oldpic.jpg");
		byte[] bytes = new byte[1024];
		int len;
		while((len = fis.read(bytes)) != -1){
			os.write(bytes,0,len);
		}
		fis.close();
		os.close();
		socket.close();
	}

	@Test
	public void Server() throws IOException {
		ServerSocket ss = new ServerSocket(9097);
		Socket socket = ss.accept();
		InputStream is = socket.getInputStream();

		FileOutputStream fos = new FileOutputStream("newpic_1.jpg");

		byte[] bytes = new byte[1024];
		int len;
		while((len = is.read(bytes)) != -1){
			fos.write(bytes,0,len);
		}
		fos.close();
		is.close();
		socket.close();
		ss.close();

	}
}
