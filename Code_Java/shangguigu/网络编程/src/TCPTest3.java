import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP的网络编程
 * 例题3：客户端发送文件给服务器，服务端将文件保存到本地,并返回”发送成功“给客户端
 * 并关闭相应的链接
 */
public class TCPTest3 {
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
		socket.shutdownOutput();
		//接受来自服务器的数据，并显示在控制台上
		InputStream is = socket.getInputStream();
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] buf = new byte[20];
		int len_2;
		while ((len_2 = is.read(buf)) != -1){
			bos.write(buf,0,len_2);
		}

		System.out.println(bos.toString());
		bos.close();
		fis.close();
		os.close();
		socket.close();
	}

	@Test
	public void Server() throws IOException {
		ServerSocket ss = new ServerSocket(9097);
		Socket socket = ss.accept();
		InputStream is = socket.getInputStream();

		FileOutputStream fos = new FileOutputStream("newpic_2.jpg");

		byte[] bytes = new byte[1024];
		int len;
		while((len = is.read(bytes)) != -1){
			fos.write(bytes,0,len);
		}
		System.out.println("图片传输完成");
		//服务器端给出反馈
		OutputStream os = socket.getOutputStream();
		os.write("你好，照片我已收到".getBytes());

		fos.close();
		is.close();
		socket.close();
		ss.close();
		os.close();

	}
}
