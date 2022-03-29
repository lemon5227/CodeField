import threading
import socket
encoding = 'utf-8'
BUFSIZE = 1024


##读取端口消息
class Reader(threading.Thread):
    def __init__(self, client):##获取客户端
        threading.Thread.__init__(self)
        self.client = client

    def run(self):##持续接收消息并处理
        while True:
            data = self.client.recv(BUFSIZE)##接收字节消息
            if (data):
                string = bytes.decode(data, encoding)##转化为字符串
                print(string)##打印接收到的消息
                self.client.send("helloClient")##回复消息
            else:
                break
        # print("close:", self.client.getpeername())

##建立端口监听
class Listener(threading.Thread):
    def __init__(self, port):
        threading.Thread.__init__(self)
        self.port = port
        self.sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self.sock.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
        self.sock.bind(("0.0.0.0", port))
        self.sock.listen(0)

    def run(self):
        print("listener started")
        while True:
            client, cltadd = self.sock.accept()
            Reader(client).start()
            # client.send("hello you!".encode())
            cltadd = cltadd
            # print("accept a connect")


lst = Listener(1234)  # create a listen thread
lst.start()  # then start