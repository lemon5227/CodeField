import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *  UDP协议的网络编程
 */
public class UDPTest {
	//发送端
	@Test
	public void senders() throws IOException{
		DatagramSocket socket = new DatagramSocket();


		String str = "我是UDP方式发送的";
		byte[] data = str.getBytes();
		InetAddress inet = InetAddress.getLocalHost();
		DatagramPacket packet = new DatagramPacket(data,0,data.length,inet,12347);
		socket.send(packet);
		socket.close();
	}

	//接收端
	@Test
	public void receivers() throws IOException {
		DatagramSocket socket = new DatagramSocket(12347);
		byte[] buf = new byte[100];
		DatagramPacket packet = new DatagramPacket(buf,0,buf.length);

		socket.receive(packet);

		System.out.println(new String(packet.getData(),0,packet.getLength()));

		socket.close();


	}
}
