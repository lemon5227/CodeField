package Interface;

/**
 *  接口的应用：代理模式
 */

public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);

        proxyServer.browser();

    }

}

interface NetWork{
    public void browser();
}

//被代理类
class Server implements NetWork{

    @Override
    public void browser() {
        System.out.println("真实的服务器访问网络");
    }
}

//代理类
class ProxyServer implements  NetWork{

    private NetWork work;

    public ProxyServer(NetWork work){
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的一些检查工作");
    }

    @Override
    public void browser() {
        check();

        work.browser();
    }
}
