#include <FS.h>

String file_name = "/taichi-maker/notes.txt";

void setup() {
    Serial.begin(9600);
    Serial.println(" ");

    if(SPIFFS.begin()){
        Serial.println("SPIFFS Started");
    }else{
        Serial.println("SPIFFS Failed to Start");
    }

    if(SPIFFS.remove(file_name)){
        Serial.print(file_name);
        Serial.println(" remove successfully");
    }else{
        Serial.print(file_name);
        Serial.println(" remove failed");
    }


}

void loop(){

}