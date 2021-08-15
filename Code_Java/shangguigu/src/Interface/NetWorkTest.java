package Interface;

/**
 *  �ӿڵ�Ӧ�ã�����ģʽ
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

//��������
class Server implements NetWork{

    @Override
    public void browser() {
        System.out.println("��ʵ�ķ�������������");
    }
}

//������
class ProxyServer implements  NetWork{

    private NetWork work;

    public ProxyServer(NetWork work){
        this.work = work;
    }

    public void check(){
        System.out.println("����֮ǰ��һЩ��鹤��");
    }

    @Override
    public void browser() {
        check();

        work.browser();
    }
}
