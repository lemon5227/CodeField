import org.junit.Test;

import java.net.URL;

/**
 *  URL:统一资源定位符，它可以表示Internet上某一资源的地址
 *  》它是一种具体的URL，即URL可以来标识一个资源，而且指明了local这个资源
 *  》通过URL我们可以访问Internet上的各种网络资源，比如最常见的www,ftp,站点。
 *      浏览器通过解析给定的URL可以在网络上查找相应的文件或其他资源
 *  》URL的基本结构五部分构成：
 *  1.<传输协议>://<主机名>:<端口号>/<文件名>#片段名?参数列表
 *   >例如：
 *      http://192.168.1.100:8080/helloworld/index.jsp#a?username=shkstart&password=123
 *   > #片段：即锚点，例如看小说，直接定位到章节
 *   > 参数列表格式：参数名=参数值&参数名=参数值...
 *
 */
public class URLTest {
	@Test
	public void test(){
		URL url = new URL("http://192.168.1.100:8080/helloworld/index.jsp#a?username=shkstart&password=123");

		//public String getProtocol()获取URL的协议名

		//public String getHost() 获取URL的主机名

		//public String getPort()获取URL的端口号

		//public String getPath() 获取URL的文件路径

		//public String getFile() 获取URL的文件名

		//public String getQuery() 获取URL的查询名
	}

}
