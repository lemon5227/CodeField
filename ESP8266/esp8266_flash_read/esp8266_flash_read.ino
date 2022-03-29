#include <ESP8266WiFi.h>
const char* ssid = "Lemon";//wifi名称
const char* password = "yan2000926";//wifi密码
const char* host="101.42.101.218";//服务器公网ip
WiFiServer server(80);//开启80端口

void setup() {
  Serial.begin(9600);//开启串口监视器
  delay(10);
  Serial.print("Connecting to");
  Serial.println(ssid);
  WiFi.begin(ssid, password);//使用名称和密码链接wifi
  while (WiFi.status() != WL_CONNECTED) {//如果连接成功跳出循环,没成功则一直尝试连接
    delay(500);
    Serial.print(".");
  }
  Serial.println("");
  Serial.println("WiFi connected");
  
  // Start the server
  server.begin();//开启服务器
  Serial.println("Server started");

  // Print the IP address
  Serial.println(WiFi.localIP());//输出板子的ip
}

int value=0;
void loop() {
  Serial.print("Connecting to ");
  Serial.println(host);
  WiFiClient client;//tcp连接
  const int httpPort=43897;//端口号
  if(!client.connect(host,httpPort)){//连接失败
    Serial.println("connection failed");
    Serial.println(WiFi.localIP());
    return;
  }
  //向服务器发送请求
  client.print("HelloServer!");
  //读取返回值
  while(client.available()){
    String line=client.readStringUntil('\r');
    Serial.print(line);
  }
  Serial.println();
  Serial.println("closing connection");
  delay(5000);
}