import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 二、网络编程的两个要素
 *  1.对应问题一：IP和端口号
 *  2.对应问题二：提供网络通信协议，TCP/IP（应用层、传输层、网络层、数据链路+物理）
 *  三、通信要素：IP和端口号
 *     1.本地回路地址：127.0.0.1 对应着：localhost
 *     2.端口号：标识正在计算机上运行的进程（程序）
 *      2.1 不同的进程有不同的端口号
 *      2.2 被规定为一个16位的整数0-65535
 *      2.3 端口分类：
 *          >公认端口：0-1023 被预先定义的服务通信占用
 *          >注册端口；1021-49151. 分配给用户进程或应用程序。
 *          >动态/私有端口：49151-65535
 *   端口号与IP地址的组合得出一个网络套接字：Socket
 *
 *  四、TCP/IP协议簇
 *      1.传输层有两个非常重要的协议
 *          1.1传输控制协议TCP（Transmission Control Protocol）
 *          1.2用户数据报协议UDP(User Datagram Protocol)
 *      2.TCP/IP 两个主要协议得名：传输控制协议（TCP）和网络互联协议（IP），
 *        实际上是一组协议，包括多个具有不同功能且互为关联的协议。
 *      3.IP(Internet Protocol)协议是网络层的主要协议，支持网间互联的数据通信
 *      4.TCP/IP协议模型从更使用的角度出发，形成了高效四层体系结构，
 *          即物理链路层、IP层、传输层和应用层
 *
 */
public class InternetAddressTest {
	@Test
	public void test1() throws UnknownHostException {
		InetAddress inet1 = InetAddress.getByName("www.baidu.com");
		System.out.println(inet1);
		InetAddress int2 = InetAddress.getByName("127.0.0.1");
		System.out.println(int2);
		System.out.println(InetAddress.getLocalHost());

	}
}
