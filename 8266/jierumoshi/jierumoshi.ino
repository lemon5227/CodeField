#include <ESP8266WiFi.h> 
const char *ssid = "wulianwang";

const char *password = "12345678";
void setup(){
  Serial.begin(9600);
  WiFi.softAP(ssid,password);
  Serial.print("Access Point: ");
  Serial.println(ssid);
  Serial.print("IP adress: ");
  Serial.println(WiFi.softAPIP());

}

void loop() {
  // put your main code here, to run repeatedly:

}
