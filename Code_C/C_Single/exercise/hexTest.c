#include <stdio.h>
#include <string.h>
#include <sys/socket.h>
#include <sys/types.h>
#include <arpa/inet.h>
#include <unistd.h>

int main(void) {
    int ret;
    // 1、使用socket()函数获取一个TCP客户端socket文件描述符
    int tcp_client = socket(AF_INET, SOCK_STREAM, 0);
    if (-1 == tcp_client)
	{
		perror("socket");
		return -1;
	}
    //2.准备服务器的地址和端口
    struct sockaddr_in server_addr = {0};
    server_addr.sin_family = AF_INET;
    server_addr.sin_port = htons(1234);
    server_addr.sin_addr.s_addr = inet_addr("101.42.101.218");
    //3.链接到服务器
    ret = connect(tcp_client,(const struct sockaddr *)&server_addr,sizeof(server_addr));
    if(ret < 0) {
        perror("connect");
    }else{
        printf("connect result: %d\n",ret);
    }

    //4.发送数据到服务端
    char sendbuf[] = {"hello world"};
    ret = send(tcp_client,sendbuf,strlen(sendbuf),0);

    //5.等待接收服务器发送过来的数据，最大接收1024个字节
    char recvbuf[1024] = {0};
    ret = recv(tcp_client,recvbuf,sizeof(recvbuf),0);

    //6.将接收到的数据打印出来
    printf("Recvdata:%s",recvbuf);

    //7.关闭套接字
    close(tcp_client);

}