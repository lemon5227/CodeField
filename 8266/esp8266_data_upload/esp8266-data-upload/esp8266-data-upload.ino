/**********************************************************************
项目名称/Project           : 零基础入门学用物联网
程序名称/Program name      : esp8266-data-upload
团队/Team                 : 太极创客团队 / Taichi-Maker (www.taichi-maker.com)
作者/Author               : CYNO 朔
日期/Date（YYYYMMDD）      : 20191109
程序目的/Purpose           : 此程序用于演示如何使用Arduino IDE向NodeMCU开发板的闪存文件系统
                            上传文件。
-----------------------------------------------------------------------
修订历史/Revision History
日期/Date    作者/Author      参考号/Ref    修订说明/Revision Description
-----------------------------------------------------------------------
说明：
在使用本程序以前，请先将ESP8266FS闪存文件上传插件安装到Arduino IDE中。具体操作请打开以下
链接前往太极创客网站相关教程页面获取详细信息。
http://www.taichi-maker.com/homepage/esp8266-nodemcu-iot/iot-c/spiffs/upload-files/
***********************************************************************/

#include <ESP8266WiFi.h>
#include <FS.h>

String file_name = "/test_text.txt";              //被读取的文件位置和名称

void setup() {
  Serial.begin(9600);
  
  SPIFFS.begin();                             //启动SPIFFS
  Serial.println("SPIFFS Started.");
  
  if (SPIFFS.exists(file_name)){
    Serial.print(file_name);
    Serial.println(" FOUND.");
  } else {
    Serial.print(file_name);
    Serial.print(" NOT FOUND.");
  }

  //建立File对象用于从SPIFFS中读取文件
  File dataFile = SPIFFS.open(file_name, "r"); 

  //读取文件内容并且通过串口监视器输出文件信息
  for(int i=0; i<dataFile.size(); i++){
    Serial.print((char)dataFile.read());       
  }

  //完成文件读取后关闭文件
  dataFile.close();                           
}

void loop() {
}
