import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP的网络编程
 * 例子1：客户端发送信息给服务端，服务端将数据显示在控制台
 */
public class TCPTest {
	@Test
	public void client() throws IOException {
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(inet,50051);

		OutputStream os = socket.getOutputStream();
		os.write("你好，我是客户端".getBytes());

		os.close();
		socket.close();
	}

	@Test
	public void server() throws IOException {
		ServerSocket ServerSocket = new ServerSocket(50051);
		Socket socket = ServerSocket.accept();
		InputStream is = socket.getInputStream();

		byte[] bytes = new byte[20];
		int len;
		while((len = is.read(bytes)) != -1){
			String str = new String(bytes,0,len);
			System.out.print(str);
		}

	}
}
