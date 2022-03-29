#include <FS.h>

String File_name = "/taichi-maker/notes.txt";

void setup() {
    Serial.begin(9600);
    Serial.println(" ");

    if(SPIFFS.begin()){
        Serial.println("SPIFFS Started");
    }else{
        Serial.println("SPIFFS Failed to Start");
    }

    if(SPIFFS.exists(File_name)){
        Serial.print(File_name);
        Serial.println(" Found.");
    }else{
        Serial.print(File_name);
        Serial.println(" NOT Found ");
    }

    File dataFile = SPIFFS.open(File_name,"r");

    for(int i =0;i<dataFile.size();i++){
        Serial.print((char)dataFile.read());
    }

    dataFile.close();
}

void loop() {

}